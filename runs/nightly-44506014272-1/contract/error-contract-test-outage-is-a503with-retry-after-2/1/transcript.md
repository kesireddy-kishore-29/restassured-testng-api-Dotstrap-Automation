# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-39379a83-40ec-4844-bca8-678cef1c1c8a` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-8cf4d07c-deaa-46a5-86c3-98519d97d199` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-ad3b4dbe-f06a-4332-9b28-7afdf537fcb6` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-46b9f5e4-46dc-4674-a926-754ad6dec2e7` |
| 5 | `GET /v1/accounts/me` | 503 | 12 | `qa-226e92a9-991d-463d-965d-860be4d952ba` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-656de465-3163-4d92-a6d3-0eed14a124f0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-d6bf05a0-24d4-4c7a-973d-c4ddb6dc6afc` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-09078203-cf4a-4915-b161-e82d96b53837` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-17cabb37-41e3-40ee-baaa-31600f6acdcf` |
| 10 | `POST /v1/auth/token` | 401 | 52 | `qa-f9a3eb7e-40b3-466a-b650-9a088d0e82ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39379a83-40ec-4844-bca8-678cef1c1c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39379a83-40ec-4844-bca8-678cef1c1c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-0cb4795cade4","displayName":"QA 0cb4795cade4","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-39379a83-40ec-4844-bca8-678cef1c1c8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-0cb4795cade4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6d3a5fb-d09d-4715-9d22-f53e17931df3","handle":"qa-0cb4795cade4","displayName":"QA 0cb4795cade4","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.524192135Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cf4d07c-deaa-46a5-86c3-98519d97d199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cf4d07c-deaa-46a5-86c3-98519d97d199
Content-Type: application/json

--- request body ---
{"handle":"qa-978323a9e680","displayName":"QA 978323a9e680","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cf4d07c-deaa-46a5-86c3-98519d97d199
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-978323a9e680
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce3f2628-37c1-4e5f-8c1b-1976dece1113","handle":"qa-978323a9e680","displayName":"QA 978323a9e680","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.572815977Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ad3b4dbe-f06a-4332-9b28-7afdf537fcb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad3b4dbe-f06a-4332-9b28-7afdf537fcb6
Content-Type: application/json

--- request body ---
{"handle":"qa-0cb4795cade4","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad3b4dbe-f06a-4332-9b28-7afdf537fcb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6d3a5fb-d09d-4715-9d22-f53e17931df3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-46b9f5e4-46dc-4674-a926-754ad6dec2e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b9f5e4-46dc-4674-a926-754ad6dec2e7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-978323a9e680","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-46b9f5e4-46dc-4674-a926-754ad6dec2e7
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
Location: /v1/conversations/cnv_29d6e1e1-63af-49f3-967f-2c6ebb7ebd2e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_29d6e1e1-63af-49f3-967f-2c6ebb7ebd2e","subject":"Error contract","status":"open","region":"eu","participants":["qa-0cb4795cade4","qa-978323a9e680"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.725006590Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-226e92a9-991d-463d-965d-860be4d952ba

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: de467819-28ab-4b00-9f47-fc95cf0e4da2
X-Correlation-Id: qa-226e92a9-991d-463d-965d-860be4d952ba
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-226e92a9-991d-463d-965d-860be4d952ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-226e92a9-991d-463d-965d-860be4d952ba"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-656de465-3163-4d92-a6d3-0eed14a124f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-656de465-3163-4d92-a6d3-0eed14a124f0
Content-Type: application/json

--- request body ---
{"handle":"qa-978323a9e680","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-656de465-3163-4d92-a6d3-0eed14a124f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce3f2628-37c1-4e5f-8c1b-1976dece1113"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6bf05a0-24d4-4c7a-973d-c4ddb6dc6afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6bf05a0-24d4-4c7a-973d-c4ddb6dc6afc
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6bf05a0-24d4-4c7a-973d-c4ddb6dc6afc
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
correlation: qa-09078203-cf4a-4915-b161-e82d96b53837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09078203-cf4a-4915-b161-e82d96b53837
Content-Type: application/json

--- request body ---
{"handle":"qa-978323a9e680","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09078203-cf4a-4915-b161-e82d96b53837
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09078203-cf4a-4915-b161-e82d96b53837"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17cabb37-41e3-40ee-baaa-31600f6acdcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17cabb37-41e3-40ee-baaa-31600f6acdcf
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17cabb37-41e3-40ee-baaa-31600f6acdcf
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
correlation: qa-f9a3eb7e-40b3-466a-b650-9a088d0e82ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a3eb7e-40b3-466a-b650-9a088d0e82ff
Content-Type: application/json

--- request body ---
{"handle":"qa-0cb4795cade4","password":"****"}

--- response: 401 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9a3eb7e-40b3-466a-b650-9a088d0e82ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9a3eb7e-40b3-466a-b650-9a088d0e82ff"}
```
