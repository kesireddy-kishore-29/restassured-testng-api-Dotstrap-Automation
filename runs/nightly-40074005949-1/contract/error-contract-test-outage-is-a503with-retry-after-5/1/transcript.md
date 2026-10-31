# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-287cff57-df1a-48a3-874c-4b291d7c7511` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-eb0ebef9-81d9-4a2d-ae8a-2a671edf49f4` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-b9ee5e87-f86a-4806-b2c9-e21aa2b68c2e` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8fd99bab-64b9-416a-9b5c-2658ad75b176` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 22 | `qa-12597053-9beb-4470-b3ec-ec1061e50790` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-8fc08025-c0a1-453c-a25f-b195aefb7b7d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-b02a7f9d-948b-405c-9d56-6255bb22543c` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-532e8f6b-0478-4113-97c6-6fbf774edaf8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2d581184-7f7a-486c-bd39-ccd3cdcedfa7` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-8c5ffdaf-d912-4035-91cb-6a8d34899cb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-287cff57-df1a-48a3-874c-4b291d7c7511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287cff57-df1a-48a3-874c-4b291d7c7511
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a96a40cdfb","displayName":"QA f6a96a40cdfb","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-287cff57-df1a-48a3-874c-4b291d7c7511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-f6a96a40cdfb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aee79d3e-20f7-4ece-92d8-34b09e608a93","handle":"qa-f6a96a40cdfb","displayName":"QA f6a96a40cdfb","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.949248337Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eb0ebef9-81d9-4a2d-ae8a-2a671edf49f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb0ebef9-81d9-4a2d-ae8a-2a671edf49f4
Content-Type: application/json

--- request body ---
{"handle":"qa-f70fd1f367af","displayName":"QA f70fd1f367af","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb0ebef9-81d9-4a2d-ae8a-2a671edf49f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-f70fd1f367af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_843d013a-a17f-4b1f-a480-a43631cd510a","handle":"qa-f70fd1f367af","displayName":"QA f70fd1f367af","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.002833099Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b9ee5e87-f86a-4806-b2c9-e21aa2b68c2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9ee5e87-f86a-4806-b2c9-e21aa2b68c2e
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a96a40cdfb","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9ee5e87-f86a-4806-b2c9-e21aa2b68c2e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aee79d3e-20f7-4ece-92d8-34b09e608a93"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8fd99bab-64b9-416a-9b5c-2658ad75b176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fd99bab-64b9-416a-9b5c-2658ad75b176
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f70fd1f367af","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fd99bab-64b9-416a-9b5c-2658ad75b176
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
Location: /v1/conversations/cnv_4c981afb-f580-4ece-91df-bd99fa4cde46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c981afb-f580-4ece-91df-bd99fa4cde46","subject":"Error contract","status":"open","region":"eu","participants":["qa-f6a96a40cdfb","qa-f70fd1f367af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.074640237Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-f6a96a40cdfb
correlation: qa-12597053-9beb-4470-b3ec-ec1061e50790

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2a63e5b5-bfe9-4344-93f4-c0a6d443e48b
X-Correlation-Id: qa-12597053-9beb-4470-b3ec-ec1061e50790
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12597053-9beb-4470-b3ec-ec1061e50790
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-f6a96a40cdfb","correlationId":"qa-12597053-9beb-4470-b3ec-ec1061e50790"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8fc08025-c0a1-453c-a25f-b195aefb7b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fc08025-c0a1-453c-a25f-b195aefb7b7d
Content-Type: application/json

--- request body ---
{"handle":"qa-f70fd1f367af","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc08025-c0a1-453c-a25f-b195aefb7b7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_843d013a-a17f-4b1f-a480-a43631cd510a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b02a7f9d-948b-405c-9d56-6255bb22543c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b02a7f9d-948b-405c-9d56-6255bb22543c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b02a7f9d-948b-405c-9d56-6255bb22543c
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
correlation: qa-532e8f6b-0478-4113-97c6-6fbf774edaf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-532e8f6b-0478-4113-97c6-6fbf774edaf8
Content-Type: application/json

--- request body ---
{"handle":"qa-f70fd1f367af","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-532e8f6b-0478-4113-97c6-6fbf774edaf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-532e8f6b-0478-4113-97c6-6fbf774edaf8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d581184-7f7a-486c-bd39-ccd3cdcedfa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d581184-7f7a-486c-bd39-ccd3cdcedfa7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d581184-7f7a-486c-bd39-ccd3cdcedfa7
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
correlation: qa-8c5ffdaf-d912-4035-91cb-6a8d34899cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5ffdaf-d912-4035-91cb-6a8d34899cb7
Content-Type: application/json

--- request body ---
{"handle":"qa-f6a96a40cdfb","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c5ffdaf-d912-4035-91cb-6a8d34899cb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c5ffdaf-d912-4035-91cb-6a8d34899cb7"}
```
