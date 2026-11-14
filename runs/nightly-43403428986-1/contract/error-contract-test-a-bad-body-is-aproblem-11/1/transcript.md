# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-fc39b6c5-e46d-45c6-9e66-f127027ae62b` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-3588c963-b13a-49aa-be8b-89572ecb3470` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-ec88333d-1ae5-48e4-a9f4-f3b52e15f163` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-35046750-ed14-48bf-86aa-33011dcdcf4d` |
| 5 | `POST /v1/conversations` | 422 | 10 | `qa-392de999-842f-4f02-bfbf-941ea8853665` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-4b87d00d-0e39-4260-9ad4-6d203ad609e1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-51edd397-8e35-4894-ac38-0db683ba7c1b` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-96d24da7-dd95-4b5b-b111-6ef108161c22` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7e5bc244-89d0-476b-b16f-5984a403cd46` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-d14ca5f7-ee57-44f3-8ea3-342a5d382c54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fc39b6c5-e46d-45c6-9e66-f127027ae62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc39b6c5-e46d-45c6-9e66-f127027ae62b
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dc287cdf5a","displayName":"QA b1dc287cdf5a","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc39b6c5-e46d-45c6-9e66-f127027ae62b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-b1dc287cdf5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_060f2e8e-6669-4fd1-88ab-05c30a0e7c30","handle":"qa-b1dc287cdf5a","displayName":"QA b1dc287cdf5a","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.640426118Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3588c963-b13a-49aa-be8b-89572ecb3470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3588c963-b13a-49aa-be8b-89572ecb3470
Content-Type: application/json

--- request body ---
{"handle":"qa-b3d33a05413f","displayName":"QA b3d33a05413f","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3588c963-b13a-49aa-be8b-89572ecb3470
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Location: /v1/accounts/qa-b3d33a05413f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74bdf8ad-c7ad-4270-89ab-273af5791c56","handle":"qa-b3d33a05413f","displayName":"QA b3d33a05413f","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.674691650Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec88333d-1ae5-48e4-a9f4-f3b52e15f163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec88333d-1ae5-48e4-a9f4-f3b52e15f163
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dc287cdf5a","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec88333d-1ae5-48e4-a9f4-f3b52e15f163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_060f2e8e-6669-4fd1-88ab-05c30a0e7c30"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35046750-ed14-48bf-86aa-33011dcdcf4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35046750-ed14-48bf-86aa-33011dcdcf4d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b3d33a05413f","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-35046750-ed14-48bf-86aa-33011dcdcf4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_3bd7227d-3497-4fb8-88d3-728f7e8152da
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3bd7227d-3497-4fb8-88d3-728f7e8152da","subject":"Error contract","status":"open","region":"eu","participants":["qa-b1dc287cdf5a","qa-b3d33a05413f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.715487803Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-392de999-842f-4f02-bfbf-941ea8853665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-392de999-842f-4f02-bfbf-941ea8853665
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b3d33a05413f","subject":" ","message":"Hi"}

--- response: 422 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-392de999-842f-4f02-bfbf-941ea8853665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-392de999-842f-4f02-bfbf-941ea8853665","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4b87d00d-0e39-4260-9ad4-6d203ad609e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b87d00d-0e39-4260-9ad4-6d203ad609e1
Content-Type: application/json

--- request body ---
{"handle":"qa-b3d33a05413f","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b87d00d-0e39-4260-9ad4-6d203ad609e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74bdf8ad-c7ad-4270-89ab-273af5791c56"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51edd397-8e35-4894-ac38-0db683ba7c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51edd397-8e35-4894-ac38-0db683ba7c1b
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51edd397-8e35-4894-ac38-0db683ba7c1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-96d24da7-dd95-4b5b-b111-6ef108161c22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d24da7-dd95-4b5b-b111-6ef108161c22
Content-Type: application/json

--- request body ---
{"handle":"qa-b3d33a05413f","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96d24da7-dd95-4b5b-b111-6ef108161c22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96d24da7-dd95-4b5b-b111-6ef108161c22"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e5bc244-89d0-476b-b16f-5984a403cd46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e5bc244-89d0-476b-b16f-5984a403cd46
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e5bc244-89d0-476b-b16f-5984a403cd46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d14ca5f7-ee57-44f3-8ea3-342a5d382c54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d14ca5f7-ee57-44f3-8ea3-342a5d382c54
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dc287cdf5a","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d14ca5f7-ee57-44f3-8ea3-342a5d382c54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d14ca5f7-ee57-44f3-8ea3-342a5d382c54"}
```
