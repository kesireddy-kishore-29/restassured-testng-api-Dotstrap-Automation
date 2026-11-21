# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-38374e19-6439-48e8-869e-2794eb195f15` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-33e0fc45-e262-4cca-870d-5b498a48377c` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-2cfc7e19-189d-49ea-bc10-4e0e5aafbba9` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-f7bee70c-e638-491b-bdfe-9defcebd9d92` |
| 5 | `PATCH /v1/accounts/me` | 422 | 27 | `qa-1b1d5beb-9f27-45c7-9ec4-c195a1bca12c` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-b2925c00-5859-4975-8584-2f42733d257d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-1361e8cc-5179-4241-9679-9a6592cd5a46` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-900889d1-e5e2-4e78-9905-1d73e2ef1f8b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-1f53e361-111d-4f2e-ac19-3f3dbfb9f1b3` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-b6862ae5-62d8-4f27-820b-99ac77e4760f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-38374e19-6439-48e8-869e-2794eb195f15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38374e19-6439-48e8-869e-2794eb195f15
Content-Type: application/json

--- request body ---
{"handle":"qa-b19a6b6d944b","displayName":"QA b19a6b6d944b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-38374e19-6439-48e8-869e-2794eb195f15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Location: /v1/accounts/qa-b19a6b6d944b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34ae7107-cffe-4ce4-a4a4-c7d7deb57c1e","handle":"qa-b19a6b6d944b","displayName":"QA b19a6b6d944b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.113964707Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33e0fc45-e262-4cca-870d-5b498a48377c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e0fc45-e262-4cca-870d-5b498a48377c
Content-Type: application/json

--- request body ---
{"handle":"qa-65eccda5700b","displayName":"QA 65eccda5700b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-33e0fc45-e262-4cca-870d-5b498a48377c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-65eccda5700b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6eb5c0a2-8e3f-44ca-ab70-04ffbb689896","handle":"qa-65eccda5700b","displayName":"QA 65eccda5700b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.145709582Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2cfc7e19-189d-49ea-bc10-4e0e5aafbba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cfc7e19-189d-49ea-bc10-4e0e5aafbba9
Content-Type: application/json

--- request body ---
{"handle":"qa-b19a6b6d944b","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cfc7e19-189d-49ea-bc10-4e0e5aafbba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34ae7107-cffe-4ce4-a4a4-c7d7deb57c1e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f7bee70c-e638-491b-bdfe-9defcebd9d92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7bee70c-e638-491b-bdfe-9defcebd9d92
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65eccda5700b","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7bee70c-e638-491b-bdfe-9defcebd9d92
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
Location: /v1/conversations/cnv_6d4bf4cd-eff5-4eca-82b0-8e8f8eb06cb6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6d4bf4cd-eff5-4eca-82b0-8e8f8eb06cb6","subject":"Error contract","status":"open","region":"eu","participants":["qa-b19a6b6d944b","qa-65eccda5700b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.207504490Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1b1d5beb-9f27-45c7-9ec4-c195a1bca12c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b1d5beb-9f27-45c7-9ec4-c195a1bca12c
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b1d5beb-9f27-45c7-9ec4-c195a1bca12c
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-1b1d5beb-9f27-45c7-9ec4-c195a1bca12c","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b2925c00-5859-4975-8584-2f42733d257d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2925c00-5859-4975-8584-2f42733d257d
Content-Type: application/json

--- request body ---
{"handle":"qa-65eccda5700b","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2925c00-5859-4975-8584-2f42733d257d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6eb5c0a2-8e3f-44ca-ab70-04ffbb689896"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1361e8cc-5179-4241-9679-9a6592cd5a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1361e8cc-5179-4241-9679-9a6592cd5a46
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1361e8cc-5179-4241-9679-9a6592cd5a46
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
correlation: qa-900889d1-e5e2-4e78-9905-1d73e2ef1f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900889d1-e5e2-4e78-9905-1d73e2ef1f8b
Content-Type: application/json

--- request body ---
{"handle":"qa-65eccda5700b","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-900889d1-e5e2-4e78-9905-1d73e2ef1f8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-900889d1-e5e2-4e78-9905-1d73e2ef1f8b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f53e361-111d-4f2e-ac19-3f3dbfb9f1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f53e361-111d-4f2e-ac19-3f3dbfb9f1b3
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f53e361-111d-4f2e-ac19-3f3dbfb9f1b3
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
correlation: qa-b6862ae5-62d8-4f27-820b-99ac77e4760f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6862ae5-62d8-4f27-820b-99ac77e4760f
Content-Type: application/json

--- request body ---
{"handle":"qa-b19a6b6d944b","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6862ae5-62d8-4f27-820b-99ac77e4760f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6862ae5-62d8-4f27-820b-99ac77e4760f"}
```
