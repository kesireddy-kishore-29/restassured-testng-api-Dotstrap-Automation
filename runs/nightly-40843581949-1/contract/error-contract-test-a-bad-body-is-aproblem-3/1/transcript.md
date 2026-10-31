# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 510 | `qa-f1552d79-04ae-4a43-8dfb-3e54fa6ee0e4` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-c6ff4d36-6c27-4a64-8e6e-eaa242ef565f` |
| 3 | `POST /v1/auth/token` | 200 | 102 | `qa-f8935d8c-b97c-4396-9bf9-2cb11c3b05e0` |
| 4 | `POST /v1/conversations` | 201 | 84 | `qa-f8020fa7-1e65-49f6-a346-2c59d37e0299` |
| 5 | `POST /v1/accounts` | 400 | 9 | `qa-09733f2b-ea8e-4efa-a339-7440e194beaf` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-6f874c48-61e4-4306-b655-090035e43a92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-8739eef6-a0d7-424c-932a-7b1fbda37d30` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-12609c05-8ea9-4157-bf5a-3206414e46f6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-24b69fb4-9a2b-40c8-b237-1b3ba905f177` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-5358933a-efb4-44b7-af36-24fd4ace395c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1552d79-04ae-4a43-8dfb-3e54fa6ee0e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1552d79-04ae-4a43-8dfb-3e54fa6ee0e4
Content-Type: application/json

--- request body ---
{"handle":"qa-4b2bda2be54c","displayName":"QA 4b2bda2be54c","password":"****","region":"eu"}

--- response: 201 in 510 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1552d79-04ae-4a43-8dfb-3e54fa6ee0e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-4b2bda2be54c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61718dc2-6e84-40dc-8449-bc753dbc229d","handle":"qa-4b2bda2be54c","displayName":"QA 4b2bda2be54c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.646668246Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c6ff4d36-6c27-4a64-8e6e-eaa242ef565f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6ff4d36-6c27-4a64-8e6e-eaa242ef565f
Content-Type: application/json

--- request body ---
{"handle":"qa-77cb4badfaf0","displayName":"QA 77cb4badfaf0","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6ff4d36-6c27-4a64-8e6e-eaa242ef565f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-77cb4badfaf0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a5d46fa-78bc-42cc-86ca-b65e25dbbf0e","handle":"qa-77cb4badfaf0","displayName":"QA 77cb4badfaf0","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.138163231Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8935d8c-b97c-4396-9bf9-2cb11c3b05e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8935d8c-b97c-4396-9bf9-2cb11c3b05e0
Content-Type: application/json

--- request body ---
{"handle":"qa-4b2bda2be54c","password":"****"}

--- response: 200 in 102 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8935d8c-b97c-4396-9bf9-2cb11c3b05e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61718dc2-6e84-40dc-8449-bc753dbc229d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f8020fa7-1e65-49f6-a346-2c59d37e0299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8020fa7-1e65-49f6-a346-2c59d37e0299
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-77cb4badfaf0","subject":"Error contract","message":"Hi"}

--- response: 201 in 84 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8020fa7-1e65-49f6-a346-2c59d37e0299
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
Location: /v1/conversations/cnv_23a1f954-391f-44dc-a40c-4dffa39e095d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_23a1f954-391f-44dc-a40c-4dffa39e095d","subject":"Error contract","status":"open","region":"eu","participants":["qa-4b2bda2be54c","qa-77cb4badfaf0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.464141374Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-09733f2b-ea8e-4efa-a339-7440e194beaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09733f2b-ea8e-4efa-a339-7440e194beaf
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09733f2b-ea8e-4efa-a339-7440e194beaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-09733f2b-ea8e-4efa-a339-7440e194beaf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6f874c48-61e4-4306-b655-090035e43a92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f874c48-61e4-4306-b655-090035e43a92
Content-Type: application/json

--- request body ---
{"handle":"qa-77cb4badfaf0","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f874c48-61e4-4306-b655-090035e43a92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a5d46fa-78bc-42cc-86ca-b65e25dbbf0e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8739eef6-a0d7-424c-932a-7b1fbda37d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8739eef6-a0d7-424c-932a-7b1fbda37d30
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8739eef6-a0d7-424c-932a-7b1fbda37d30
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
correlation: qa-12609c05-8ea9-4157-bf5a-3206414e46f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12609c05-8ea9-4157-bf5a-3206414e46f6
Content-Type: application/json

--- request body ---
{"handle":"qa-77cb4badfaf0","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12609c05-8ea9-4157-bf5a-3206414e46f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12609c05-8ea9-4157-bf5a-3206414e46f6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24b69fb4-9a2b-40c8-b237-1b3ba905f177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b69fb4-9a2b-40c8-b237-1b3ba905f177
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24b69fb4-9a2b-40c8-b237-1b3ba905f177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5358933a-efb4-44b7-af36-24fd4ace395c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5358933a-efb4-44b7-af36-24fd4ace395c
Content-Type: application/json

--- request body ---
{"handle":"qa-4b2bda2be54c","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5358933a-efb4-44b7-af36-24fd4ace395c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5358933a-efb4-44b7-af36-24fd4ace395c"}
```
