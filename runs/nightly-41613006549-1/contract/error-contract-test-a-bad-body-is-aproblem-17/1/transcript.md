# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-0eae2000-fecf-426f-be7d-7a84eb77770f` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-6473ffb8-08b5-48d0-8662-8f8830e6692b` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-8b45b11f-6320-43f3-9fd1-c39d9b87dfbc` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-f9d68994-27e7-4a32-a23a-002f68b91db0` |
| 5 | `POST /v1/credits/purchases` | 422 | 19 | `qa-7b5eab93-ee61-4d8d-81e2-4ceae5336bd5` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-f52a0e85-ec0c-45aa-8c7d-3f90a45fbc17` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8f6273d3-ca53-41a2-9038-034c9ee7ea5e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-2ea3460d-291b-474d-9d73-b24771cd0859` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b2ef9aea-6cc4-46ce-8cfc-9f272e4ebaa4` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-eb282245-de99-405f-a110-b363b64e019b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0eae2000-fecf-426f-be7d-7a84eb77770f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eae2000-fecf-426f-be7d-7a84eb77770f
Content-Type: application/json

--- request body ---
{"handle":"qa-af8443cb0310","displayName":"QA af8443cb0310","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eae2000-fecf-426f-be7d-7a84eb77770f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Location: /v1/accounts/qa-af8443cb0310
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dedc0c59-cf19-456f-8eaf-0427fe9d1f05","handle":"qa-af8443cb0310","displayName":"QA af8443cb0310","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.432547090Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6473ffb8-08b5-48d0-8662-8f8830e6692b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6473ffb8-08b5-48d0-8662-8f8830e6692b
Content-Type: application/json

--- request body ---
{"handle":"qa-afc1acbd4af4","displayName":"QA afc1acbd4af4","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6473ffb8-08b5-48d0-8662-8f8830e6692b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 8
Location: /v1/accounts/qa-afc1acbd4af4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06a9ad5b-b336-4b4a-800f-f9ab8cec94a1","handle":"qa-afc1acbd4af4","displayName":"QA afc1acbd4af4","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.448422817Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8b45b11f-6320-43f3-9fd1-c39d9b87dfbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b45b11f-6320-43f3-9fd1-c39d9b87dfbc
Content-Type: application/json

--- request body ---
{"handle":"qa-af8443cb0310","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b45b11f-6320-43f3-9fd1-c39d9b87dfbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dedc0c59-cf19-456f-8eaf-0427fe9d1f05"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f9d68994-27e7-4a32-a23a-002f68b91db0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d68994-27e7-4a32-a23a-002f68b91db0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-afc1acbd4af4","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9d68994-27e7-4a32-a23a-002f68b91db0
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
Location: /v1/conversations/cnv_951d7366-7290-4a37-ba6b-02a75d5b8e7e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_951d7366-7290-4a37-ba6b-02a75d5b8e7e","subject":"Error contract","status":"open","region":"eu","participants":["qa-af8443cb0310","qa-afc1acbd4af4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.518097054Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7b5eab93-ee61-4d8d-81e2-4ceae5336bd5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e5025083d00b44eeb166401a4111abdc
X-Correlation-Id: qa-7b5eab93-ee61-4d8d-81e2-4ceae5336bd5
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b5eab93-ee61-4d8d-81e2-4ceae5336bd5
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-7b5eab93-ee61-4d8d-81e2-4ceae5336bd5","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f52a0e85-ec0c-45aa-8c7d-3f90a45fbc17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f52a0e85-ec0c-45aa-8c7d-3f90a45fbc17
Content-Type: application/json

--- request body ---
{"handle":"qa-afc1acbd4af4","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f52a0e85-ec0c-45aa-8c7d-3f90a45fbc17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06a9ad5b-b336-4b4a-800f-f9ab8cec94a1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f6273d3-ca53-41a2-9038-034c9ee7ea5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f6273d3-ca53-41a2-9038-034c9ee7ea5e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f6273d3-ca53-41a2-9038-034c9ee7ea5e
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
correlation: qa-2ea3460d-291b-474d-9d73-b24771cd0859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ea3460d-291b-474d-9d73-b24771cd0859
Content-Type: application/json

--- request body ---
{"handle":"qa-afc1acbd4af4","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ea3460d-291b-474d-9d73-b24771cd0859
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ea3460d-291b-474d-9d73-b24771cd0859"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2ef9aea-6cc4-46ce-8cfc-9f272e4ebaa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ef9aea-6cc4-46ce-8cfc-9f272e4ebaa4
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2ef9aea-6cc4-46ce-8cfc-9f272e4ebaa4
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
correlation: qa-eb282245-de99-405f-a110-b363b64e019b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb282245-de99-405f-a110-b363b64e019b
Content-Type: application/json

--- request body ---
{"handle":"qa-af8443cb0310","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb282245-de99-405f-a110-b363b64e019b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb282245-de99-405f-a110-b363b64e019b"}
```
