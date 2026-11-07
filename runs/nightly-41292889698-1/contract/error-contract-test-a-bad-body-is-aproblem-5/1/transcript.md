# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 68 | `qa-bd510bb5-f8d1-46ab-86ea-893b4efe679c` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-4b42ae27-448b-4168-afca-c847cbf56755` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-5544af8b-cca7-4193-b257-54da38e9128c` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-7b8599c5-38fe-4fa7-85d0-09e49406a8a3` |
| 5 | `POST /v1/accounts` | 422 | 25 | `qa-47de9728-561b-400c-aef8-1888782d9c27` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-728ddb6a-4b90-4eb5-8a0f-db1c3c739371` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-48a5dd75-d72a-4e5a-8861-f1d22f547c2f` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-830637c2-1540-4470-9c5c-3792f03f109e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 65 | `qa-01154414-08c0-4eff-8b71-1d148721fdaa` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-f4dd22c4-4c91-448b-b80b-a50e1e702039` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bd510bb5-f8d1-46ab-86ea-893b4efe679c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd510bb5-f8d1-46ab-86ea-893b4efe679c
Content-Type: application/json

--- request body ---
{"handle":"qa-ca00ffb2062c","displayName":"QA ca00ffb2062c","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd510bb5-f8d1-46ab-86ea-893b4efe679c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Location: /v1/accounts/qa-ca00ffb2062c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6718c139-cf7d-4f05-ac91-a2bbe522e37e","handle":"qa-ca00ffb2062c","displayName":"QA ca00ffb2062c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.299239360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b42ae27-448b-4168-afca-c847cbf56755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b42ae27-448b-4168-afca-c847cbf56755
Content-Type: application/json

--- request body ---
{"handle":"qa-6a3d39b703f7","displayName":"QA 6a3d39b703f7","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b42ae27-448b-4168-afca-c847cbf56755
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Location: /v1/accounts/qa-6a3d39b703f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_125abdaf-6a26-4121-820d-7505481c5a33","handle":"qa-6a3d39b703f7","displayName":"QA 6a3d39b703f7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.340412233Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5544af8b-cca7-4193-b257-54da38e9128c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5544af8b-cca7-4193-b257-54da38e9128c
Content-Type: application/json

--- request body ---
{"handle":"qa-ca00ffb2062c","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5544af8b-cca7-4193-b257-54da38e9128c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6718c139-cf7d-4f05-ac91-a2bbe522e37e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7b8599c5-38fe-4fa7-85d0-09e49406a8a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b8599c5-38fe-4fa7-85d0-09e49406a8a3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a3d39b703f7","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b8599c5-38fe-4fa7-85d0-09e49406a8a3
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
Location: /v1/conversations/cnv_8ea7c172-704f-4880-8876-facfb761b2a1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8ea7c172-704f-4880-8876-facfb761b2a1","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca00ffb2062c","qa-6a3d39b703f7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.452490647Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-47de9728-561b-400c-aef8-1888782d9c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47de9728-561b-400c-aef8-1888782d9c27
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47de9728-561b-400c-aef8-1888782d9c27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-47de9728-561b-400c-aef8-1888782d9c27","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-728ddb6a-4b90-4eb5-8a0f-db1c3c739371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728ddb6a-4b90-4eb5-8a0f-db1c3c739371
Content-Type: application/json

--- request body ---
{"handle":"qa-6a3d39b703f7","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-728ddb6a-4b90-4eb5-8a0f-db1c3c739371
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_125abdaf-6a26-4121-820d-7505481c5a33"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48a5dd75-d72a-4e5a-8861-f1d22f547c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a5dd75-d72a-4e5a-8861-f1d22f547c2f
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48a5dd75-d72a-4e5a-8861-f1d22f547c2f
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
correlation: qa-830637c2-1540-4470-9c5c-3792f03f109e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-830637c2-1540-4470-9c5c-3792f03f109e
Content-Type: application/json

--- request body ---
{"handle":"qa-6a3d39b703f7","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-830637c2-1540-4470-9c5c-3792f03f109e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-830637c2-1540-4470-9c5c-3792f03f109e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01154414-08c0-4eff-8b71-1d148721fdaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01154414-08c0-4eff-8b71-1d148721fdaa
Content-Type: application/json

--- response: 204 in 65 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01154414-08c0-4eff-8b71-1d148721fdaa
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f4dd22c4-4c91-448b-b80b-a50e1e702039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4dd22c4-4c91-448b-b80b-a50e1e702039
Content-Type: application/json

--- request body ---
{"handle":"qa-ca00ffb2062c","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4dd22c4-4c91-448b-b80b-a50e1e702039
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4dd22c4-4c91-448b-b80b-a50e1e702039"}
```
