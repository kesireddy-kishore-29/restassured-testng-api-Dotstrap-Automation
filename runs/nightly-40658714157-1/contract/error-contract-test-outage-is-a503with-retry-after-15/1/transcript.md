# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-88af75ca-adbd-418c-b143-bc4f64d965c5` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-f6b1687c-0585-4580-becf-b3d20e9eae0a` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-c3258af5-90a1-4899-a76a-782eb59cc5c1` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-3d8ca314-4ff4-453b-be07-8a5fe802df9d` |
| 5 | `POST /v1/credits/purchases` | 503 | 14 | `qa-69b174aa-02a9-41b5-ba7f-e762381bf9f0` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-19a1065a-3238-4c46-aaae-a345b567db04` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-27352df6-f804-47ea-9436-7e3a3c32f133` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-150140a0-a752-4a26-9273-5f24ecc60f39` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-490c6a9e-15e3-42d4-92cf-b00cf12eef94` |
| 10 | `POST /v1/auth/token` | 401 | 1 | `qa-01361ce4-9d98-48d9-99cc-124a7d0c86ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88af75ca-adbd-418c-b143-bc4f64d965c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88af75ca-adbd-418c-b143-bc4f64d965c5
Content-Type: application/json

--- request body ---
{"handle":"qa-d6d76e953021","displayName":"QA d6d76e953021","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-88af75ca-adbd-418c-b143-bc4f64d965c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 8
Location: /v1/accounts/qa-d6d76e953021
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e4f1e1a-a383-4e8d-9845-dd44104b25b6","handle":"qa-d6d76e953021","displayName":"QA d6d76e953021","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.144214237Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6b1687c-0585-4580-becf-b3d20e9eae0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6b1687c-0585-4580-becf-b3d20e9eae0a
Content-Type: application/json

--- request body ---
{"handle":"qa-a0a6c2119607","displayName":"QA a0a6c2119607","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b1687c-0585-4580-becf-b3d20e9eae0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Location: /v1/accounts/qa-a0a6c2119607
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e064aedc-5483-48b3-8e9e-6b2b0b250d17","handle":"qa-a0a6c2119607","displayName":"QA a0a6c2119607","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.171535917Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c3258af5-90a1-4899-a76a-782eb59cc5c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3258af5-90a1-4899-a76a-782eb59cc5c1
Content-Type: application/json

--- request body ---
{"handle":"qa-d6d76e953021","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3258af5-90a1-4899-a76a-782eb59cc5c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e4f1e1a-a383-4e8d-9845-dd44104b25b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d8ca314-4ff4-453b-be07-8a5fe802df9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8ca314-4ff4-453b-be07-8a5fe802df9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a0a6c2119607","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d8ca314-4ff4-453b-be07-8a5fe802df9d
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
Location: /v1/conversations/cnv_bd8a1294-74f3-43dc-829e-95315c0dc09d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bd8a1294-74f3-43dc-829e-95315c0dc09d","subject":"Error contract","status":"open","region":"eu","participants":["qa-d6d76e953021","qa-a0a6c2119607"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.238024617Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-69b174aa-02a9-41b5-ba7f-e762381bf9f0

--- request headers ---
Accept: application/json
X-Fault-Key: a1f53d3f-960a-457d-93f4-f680cdf1b039
Idempotency-Key: qa-ca7d00fd098244ee8e9f357eda2fa1c6
X-Fault: unavailable-once
X-Correlation-Id: qa-69b174aa-02a9-41b5-ba7f-e762381bf9f0
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69b174aa-02a9-41b5-ba7f-e762381bf9f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-69b174aa-02a9-41b5-ba7f-e762381bf9f0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-19a1065a-3238-4c46-aaae-a345b567db04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a1065a-3238-4c46-aaae-a345b567db04
Content-Type: application/json

--- request body ---
{"handle":"qa-a0a6c2119607","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a1065a-3238-4c46-aaae-a345b567db04
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e064aedc-5483-48b3-8e9e-6b2b0b250d17"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27352df6-f804-47ea-9436-7e3a3c32f133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27352df6-f804-47ea-9436-7e3a3c32f133
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27352df6-f804-47ea-9436-7e3a3c32f133
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
correlation: qa-150140a0-a752-4a26-9273-5f24ecc60f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150140a0-a752-4a26-9273-5f24ecc60f39
Content-Type: application/json

--- request body ---
{"handle":"qa-a0a6c2119607","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-150140a0-a752-4a26-9273-5f24ecc60f39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-150140a0-a752-4a26-9273-5f24ecc60f39"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-490c6a9e-15e3-42d4-92cf-b00cf12eef94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-490c6a9e-15e3-42d4-92cf-b00cf12eef94
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-490c6a9e-15e3-42d4-92cf-b00cf12eef94
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
correlation: qa-01361ce4-9d98-48d9-99cc-124a7d0c86ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01361ce4-9d98-48d9-99cc-124a7d0c86ed
Content-Type: application/json

--- request body ---
{"handle":"qa-d6d76e953021","password":"****"}

--- response: 401 in 1 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01361ce4-9d98-48d9-99cc-124a7d0c86ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-01361ce4-9d98-48d9-99cc-124a7d0c86ed"}
```
