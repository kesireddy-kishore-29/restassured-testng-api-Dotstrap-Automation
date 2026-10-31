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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-3ae27b69-f46f-40fd-8894-2848c381365b` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-26c95cbd-1b4e-497d-bf48-6258ed5cc0b9` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-9aa6475c-62b3-4e06-b919-d439b90fd40e` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-669c15ec-fbb5-4e50-83c3-c555a096a529` |
| 5 | `POST /v1/conversations` | 422 | 15 | `qa-957bae67-94d8-47f8-98e4-11520a69bf81` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-b434eb0a-68ad-4d22-96f3-32272b796414` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ec5ad091-29be-40a5-8bcc-5898300a0abb` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-9a055726-7926-42b6-bc14-4b3e9ea754b6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-66ef8de3-cdb6-4417-ba14-47ade0a61f75` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-196b7b9d-1e30-476c-bc19-0c9e4ba98b61` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ae27b69-f46f-40fd-8894-2848c381365b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ae27b69-f46f-40fd-8894-2848c381365b
Content-Type: application/json

--- request body ---
{"handle":"qa-4a56685462c4","displayName":"QA 4a56685462c4","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ae27b69-f46f-40fd-8894-2848c381365b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-4a56685462c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4e0f264-61d0-4ff0-9aba-16c54533fd56","handle":"qa-4a56685462c4","displayName":"QA 4a56685462c4","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.862932472Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-26c95cbd-1b4e-497d-bf48-6258ed5cc0b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26c95cbd-1b4e-497d-bf48-6258ed5cc0b9
Content-Type: application/json

--- request body ---
{"handle":"qa-d93ca6f9f2c8","displayName":"QA d93ca6f9f2c8","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-26c95cbd-1b4e-497d-bf48-6258ed5cc0b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Location: /v1/accounts/qa-d93ca6f9f2c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d272f98-724d-4681-94a2-9fe6e08d47da","handle":"qa-d93ca6f9f2c8","displayName":"QA d93ca6f9f2c8","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.899918761Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9aa6475c-62b3-4e06-b919-d439b90fd40e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aa6475c-62b3-4e06-b919-d439b90fd40e
Content-Type: application/json

--- request body ---
{"handle":"qa-4a56685462c4","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aa6475c-62b3-4e06-b919-d439b90fd40e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4e0f264-61d0-4ff0-9aba-16c54533fd56"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-669c15ec-fbb5-4e50-83c3-c555a096a529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-669c15ec-fbb5-4e50-83c3-c555a096a529
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d93ca6f9f2c8","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-669c15ec-fbb5-4e50-83c3-c555a096a529
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
Location: /v1/conversations/cnv_1710d1c2-bf99-45b3-b496-cb6140c814f2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1710d1c2-bf99-45b3-b496-cb6140c814f2","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a56685462c4","qa-d93ca6f9f2c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.996631908Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-957bae67-94d8-47f8-98e4-11520a69bf81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-957bae67-94d8-47f8-98e4-11520a69bf81
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d93ca6f9f2c8","subject":" ","message":"Hi"}

--- response: 422 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-957bae67-94d8-47f8-98e4-11520a69bf81
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-957bae67-94d8-47f8-98e4-11520a69bf81","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b434eb0a-68ad-4d22-96f3-32272b796414

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b434eb0a-68ad-4d22-96f3-32272b796414
Content-Type: application/json

--- request body ---
{"handle":"qa-d93ca6f9f2c8","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b434eb0a-68ad-4d22-96f3-32272b796414
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d272f98-724d-4681-94a2-9fe6e08d47da"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec5ad091-29be-40a5-8bcc-5898300a0abb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec5ad091-29be-40a5-8bcc-5898300a0abb
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec5ad091-29be-40a5-8bcc-5898300a0abb
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
correlation: qa-9a055726-7926-42b6-bc14-4b3e9ea754b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a055726-7926-42b6-bc14-4b3e9ea754b6
Content-Type: application/json

--- request body ---
{"handle":"qa-d93ca6f9f2c8","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a055726-7926-42b6-bc14-4b3e9ea754b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a055726-7926-42b6-bc14-4b3e9ea754b6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66ef8de3-cdb6-4417-ba14-47ade0a61f75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ef8de3-cdb6-4417-ba14-47ade0a61f75
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66ef8de3-cdb6-4417-ba14-47ade0a61f75
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
correlation: qa-196b7b9d-1e30-476c-bc19-0c9e4ba98b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-196b7b9d-1e30-476c-bc19-0c9e4ba98b61
Content-Type: application/json

--- request body ---
{"handle":"qa-4a56685462c4","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-196b7b9d-1e30-476c-bc19-0c9e4ba98b61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-196b7b9d-1e30-476c-bc19-0c9e4ba98b61"}
```
