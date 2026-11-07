# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 80 | `qa-70053b3b-8750-4e5b-9669-07d374a82b58` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-86288c04-7194-42de-b791-b4a4bfe6ee60` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d2f770f4-c158-4784-ae33-28a90abe8b33` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-581ab978-b000-4bd0-9394-7fb8a3178dbf` |
| 5 | `GET /v1/conversations` | 503 | 20 | `qa-4b6eede4-85d7-436b-bd54-0868da5bc9e6` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-d7b7de5f-f31d-4d08-a3e9-0aca24bc140e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-ee354685-87df-4e98-b8e4-d562f749cba1` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-1b4d795a-658c-4cdb-8bfd-ba1f9ce81017` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ce0094d4-7afa-46a0-813d-4bbae9a0934c` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-8e40e9cd-155a-4a46-91e3-d656de49b9ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70053b3b-8750-4e5b-9669-07d374a82b58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70053b3b-8750-4e5b-9669-07d374a82b58
Content-Type: application/json

--- request body ---
{"handle":"qa-feee21249b9c","displayName":"QA feee21249b9c","password":"****","region":"eu"}

--- response: 201 in 80 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-70053b3b-8750-4e5b-9669-07d374a82b58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Location: /v1/accounts/qa-feee21249b9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bc4cc2e-ea54-4a7f-9252-696bcbcd4651","handle":"qa-feee21249b9c","displayName":"QA feee21249b9c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.767578051Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-86288c04-7194-42de-b791-b4a4bfe6ee60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86288c04-7194-42de-b791-b4a4bfe6ee60
Content-Type: application/json

--- request body ---
{"handle":"qa-12b773a16e03","displayName":"QA 12b773a16e03","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-86288c04-7194-42de-b791-b4a4bfe6ee60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Location: /v1/accounts/qa-12b773a16e03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c329fa91-b084-48d1-ab9a-12f3608ffe39","handle":"qa-12b773a16e03","displayName":"QA 12b773a16e03","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.834328831Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d2f770f4-c158-4784-ae33-28a90abe8b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2f770f4-c158-4784-ae33-28a90abe8b33
Content-Type: application/json

--- request body ---
{"handle":"qa-feee21249b9c","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2f770f4-c158-4784-ae33-28a90abe8b33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bc4cc2e-ea54-4a7f-9252-696bcbcd4651"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-581ab978-b000-4bd0-9394-7fb8a3178dbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-581ab978-b000-4bd0-9394-7fb8a3178dbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12b773a16e03","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-581ab978-b000-4bd0-9394-7fb8a3178dbf
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
Location: /v1/conversations/cnv_b73a9eff-cf25-43e8-ac5a-a6ca99e2ca2b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b73a9eff-cf25-43e8-ac5a-a6ca99e2ca2b","subject":"Error contract","status":"open","region":"eu","participants":["qa-feee21249b9c","qa-12b773a16e03"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.927057253Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-4b6eede4-85d7-436b-bd54-0868da5bc9e6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f4e686fd-5136-408a-9301-ca1da699d2bf
X-Correlation-Id: qa-4b6eede4-85d7-436b-bd54-0868da5bc9e6
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b6eede4-85d7-436b-bd54-0868da5bc9e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-4b6eede4-85d7-436b-bd54-0868da5bc9e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d7b7de5f-f31d-4d08-a3e9-0aca24bc140e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b7de5f-f31d-4d08-a3e9-0aca24bc140e
Content-Type: application/json

--- request body ---
{"handle":"qa-12b773a16e03","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7b7de5f-f31d-4d08-a3e9-0aca24bc140e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c329fa91-b084-48d1-ab9a-12f3608ffe39"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee354685-87df-4e98-b8e4-d562f749cba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee354685-87df-4e98-b8e4-d562f749cba1
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee354685-87df-4e98-b8e4-d562f749cba1
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
correlation: qa-1b4d795a-658c-4cdb-8bfd-ba1f9ce81017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b4d795a-658c-4cdb-8bfd-ba1f9ce81017
Content-Type: application/json

--- request body ---
{"handle":"qa-12b773a16e03","password":"****"}

--- response: 401 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b4d795a-658c-4cdb-8bfd-ba1f9ce81017
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b4d795a-658c-4cdb-8bfd-ba1f9ce81017"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce0094d4-7afa-46a0-813d-4bbae9a0934c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0094d4-7afa-46a0-813d-4bbae9a0934c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce0094d4-7afa-46a0-813d-4bbae9a0934c
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
correlation: qa-8e40e9cd-155a-4a46-91e3-d656de49b9ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e40e9cd-155a-4a46-91e3-d656de49b9ac
Content-Type: application/json

--- request body ---
{"handle":"qa-feee21249b9c","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e40e9cd-155a-4a46-91e3-d656de49b9ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e40e9cd-155a-4a46-91e3-d656de49b9ac"}
```
