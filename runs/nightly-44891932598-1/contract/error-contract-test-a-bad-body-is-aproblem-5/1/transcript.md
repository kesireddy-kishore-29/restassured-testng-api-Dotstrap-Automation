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
| 1 | `POST /v1/accounts` | 201 | 85 | `qa-f481a9be-cf0b-4a3f-ac64-6ca245cc2d8d` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-69cd696f-a127-4fa0-901c-649a3758d467` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-98420636-924a-4549-a111-7e7665ea56c8` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-25d545b7-b876-4732-a787-e8e32eeaac61` |
| 5 | `POST /v1/accounts` | 422 | 18 | `qa-dd3d362f-668a-475b-87a3-c868ac001762` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-fd56971a-322e-4403-abfd-74d4e836347d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4dcdca2a-d31a-4d52-8fa6-52f137249efa` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-b3bc6c1a-1749-4509-bec2-19e9ea615388` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ebbd1518-bb27-4d7a-97ba-36c2bfec0f70` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-de2c773b-18b0-4b2a-916f-8e8ae4fd0c97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f481a9be-cf0b-4a3f-ac64-6ca245cc2d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f481a9be-cf0b-4a3f-ac64-6ca245cc2d8d
Content-Type: application/json

--- request body ---
{"handle":"qa-1c488be5e5e8","displayName":"QA 1c488be5e5e8","password":"****","region":"eu"}

--- response: 201 in 85 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f481a9be-cf0b-4a3f-ac64-6ca245cc2d8d
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
Location: /v1/accounts/qa-1c488be5e5e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0471b51d-75a3-40bd-9059-7986c4378c73","handle":"qa-1c488be5e5e8","displayName":"QA 1c488be5e5e8","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.906620035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-69cd696f-a127-4fa0-901c-649a3758d467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69cd696f-a127-4fa0-901c-649a3758d467
Content-Type: application/json

--- request body ---
{"handle":"qa-d318a937e6d7","displayName":"QA d318a937e6d7","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-69cd696f-a127-4fa0-901c-649a3758d467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Location: /v1/accounts/qa-d318a937e6d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4c6a013-a749-437e-9bd4-417a970cbf2e","handle":"qa-d318a937e6d7","displayName":"QA d318a937e6d7","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.982580765Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98420636-924a-4549-a111-7e7665ea56c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98420636-924a-4549-a111-7e7665ea56c8
Content-Type: application/json

--- request body ---
{"handle":"qa-1c488be5e5e8","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-98420636-924a-4549-a111-7e7665ea56c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0471b51d-75a3-40bd-9059-7986c4378c73"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-25d545b7-b876-4732-a787-e8e32eeaac61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d545b7-b876-4732-a787-e8e32eeaac61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d318a937e6d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-25d545b7-b876-4732-a787-e8e32eeaac61
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
Location: /v1/conversations/cnv_9624553c-76eb-41d5-ae8d-f41026b90480
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9624553c-76eb-41d5-ae8d-f41026b90480","subject":"Error contract","status":"open","region":"eu","participants":["qa-1c488be5e5e8","qa-d318a937e6d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.092705344Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-dd3d362f-668a-475b-87a3-c868ac001762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd3d362f-668a-475b-87a3-c868ac001762
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd3d362f-668a-475b-87a3-c868ac001762
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-dd3d362f-668a-475b-87a3-c868ac001762","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fd56971a-322e-4403-abfd-74d4e836347d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd56971a-322e-4403-abfd-74d4e836347d
Content-Type: application/json

--- request body ---
{"handle":"qa-d318a937e6d7","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd56971a-322e-4403-abfd-74d4e836347d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4c6a013-a749-437e-9bd4-417a970cbf2e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dcdca2a-d31a-4d52-8fa6-52f137249efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dcdca2a-d31a-4d52-8fa6-52f137249efa
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dcdca2a-d31a-4d52-8fa6-52f137249efa
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
correlation: qa-b3bc6c1a-1749-4509-bec2-19e9ea615388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3bc6c1a-1749-4509-bec2-19e9ea615388
Content-Type: application/json

--- request body ---
{"handle":"qa-d318a937e6d7","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3bc6c1a-1749-4509-bec2-19e9ea615388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b3bc6c1a-1749-4509-bec2-19e9ea615388"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ebbd1518-bb27-4d7a-97ba-36c2bfec0f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebbd1518-bb27-4d7a-97ba-36c2bfec0f70
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ebbd1518-bb27-4d7a-97ba-36c2bfec0f70
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
correlation: qa-de2c773b-18b0-4b2a-916f-8e8ae4fd0c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de2c773b-18b0-4b2a-916f-8e8ae4fd0c97
Content-Type: application/json

--- request body ---
{"handle":"qa-1c488be5e5e8","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de2c773b-18b0-4b2a-916f-8e8ae4fd0c97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de2c773b-18b0-4b2a-916f-8e8ae4fd0c97"}
```
