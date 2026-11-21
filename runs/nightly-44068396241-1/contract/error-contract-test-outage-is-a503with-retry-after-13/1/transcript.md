# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-496a44d6-59c2-4179-8acf-1f9a76b31fbe` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-d30a9b4a-9852-4268-9b05-6e49b30e5106` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-6078275d-29d1-450a-aad8-d55a8ba194ec` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-135aba48-ab9b-483d-b575-234b131a0b32` |
| 5 | `GET /v1/credits/balance` | 503 | 15 | `qa-c38d2463-0d23-42a9-b899-6d5f22d4539b` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-e3a3cf40-a0b4-4f20-a7dc-46e08e63cb86` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d274cc39-c906-43e6-9939-692c244175d5` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-ac240e5a-a496-4305-902e-d9dfd33cc6b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a524d225-cf99-4cd3-bf29-075bf58d8cc2` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-f5655ce6-8c44-4714-b013-de115ee8eb64` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-496a44d6-59c2-4179-8acf-1f9a76b31fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-496a44d6-59c2-4179-8acf-1f9a76b31fbe
Content-Type: application/json

--- request body ---
{"handle":"qa-e308c3056e87","displayName":"QA e308c3056e87","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-496a44d6-59c2-4179-8acf-1f9a76b31fbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-e308c3056e87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e3e47ea-ed5a-4dd9-a881-eb400b9fc0d7","handle":"qa-e308c3056e87","displayName":"QA e308c3056e87","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.756549129Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d30a9b4a-9852-4268-9b05-6e49b30e5106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30a9b4a-9852-4268-9b05-6e49b30e5106
Content-Type: application/json

--- request body ---
{"handle":"qa-66d6386408e1","displayName":"QA 66d6386408e1","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d30a9b4a-9852-4268-9b05-6e49b30e5106
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
Location: /v1/accounts/qa-66d6386408e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a91a9bb5-03a4-43c8-997d-c86ee38ccaf4","handle":"qa-66d6386408e1","displayName":"QA 66d6386408e1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.796470768Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6078275d-29d1-450a-aad8-d55a8ba194ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6078275d-29d1-450a-aad8-d55a8ba194ec
Content-Type: application/json

--- request body ---
{"handle":"qa-e308c3056e87","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6078275d-29d1-450a-aad8-d55a8ba194ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e3e47ea-ed5a-4dd9-a881-eb400b9fc0d7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-135aba48-ab9b-483d-b575-234b131a0b32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-135aba48-ab9b-483d-b575-234b131a0b32
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66d6386408e1","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-135aba48-ab9b-483d-b575-234b131a0b32
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
Location: /v1/conversations/cnv_f8f59b9f-4173-4643-96a4-21b97f85ad8b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f8f59b9f-4173-4643-96a4-21b97f85ad8b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e308c3056e87","qa-66d6386408e1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.856378076Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-c38d2463-0d23-42a9-b899-6d5f22d4539b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 246b62b7-14a2-43e4-bb51-3f8b46d1741e
X-Correlation-Id: qa-c38d2463-0d23-42a9-b899-6d5f22d4539b
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c38d2463-0d23-42a9-b899-6d5f22d4539b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-c38d2463-0d23-42a9-b899-6d5f22d4539b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e3a3cf40-a0b4-4f20-a7dc-46e08e63cb86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3a3cf40-a0b4-4f20-a7dc-46e08e63cb86
Content-Type: application/json

--- request body ---
{"handle":"qa-66d6386408e1","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3a3cf40-a0b4-4f20-a7dc-46e08e63cb86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a91a9bb5-03a4-43c8-997d-c86ee38ccaf4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d274cc39-c906-43e6-9939-692c244175d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d274cc39-c906-43e6-9939-692c244175d5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d274cc39-c906-43e6-9939-692c244175d5
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
correlation: qa-ac240e5a-a496-4305-902e-d9dfd33cc6b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac240e5a-a496-4305-902e-d9dfd33cc6b5
Content-Type: application/json

--- request body ---
{"handle":"qa-66d6386408e1","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac240e5a-a496-4305-902e-d9dfd33cc6b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac240e5a-a496-4305-902e-d9dfd33cc6b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a524d225-cf99-4cd3-bf29-075bf58d8cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a524d225-cf99-4cd3-bf29-075bf58d8cc2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a524d225-cf99-4cd3-bf29-075bf58d8cc2
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
correlation: qa-f5655ce6-8c44-4714-b013-de115ee8eb64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5655ce6-8c44-4714-b013-de115ee8eb64
Content-Type: application/json

--- request body ---
{"handle":"qa-e308c3056e87","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5655ce6-8c44-4714-b013-de115ee8eb64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5655ce6-8c44-4714-b013-de115ee8eb64"}
```
