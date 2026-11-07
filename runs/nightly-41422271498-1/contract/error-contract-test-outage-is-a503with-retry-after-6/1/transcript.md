# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-09739262-2bf5-4141-9e5e-82b62bd9c8af` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-7d8b2cc2-2f98-4b50-82d4-ae4794ecb14c` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-383ee06e-3d92-4ba5-9fe6-0c2a71854d73` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-74335a52-9340-42f5-a598-2432c1bcf530` |
| 5 | `POST /v1/conversations` | 503 | 17 | `qa-52547120-8f7f-4557-9a91-d3b2e5ddc055` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-ac6d725b-55d8-40c2-9492-f112dd44886d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4dc4ec86-9f2c-498b-a272-855aaa01ea3a` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-ab6c4b09-ca55-49ad-90fb-ea986c628ac6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8ef238b8-6f05-47e7-9c9f-66c61589b544` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-ba525fa0-e47e-4d60-a65b-88657a95686f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09739262-2bf5-4141-9e5e-82b62bd9c8af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09739262-2bf5-4141-9e5e-82b62bd9c8af
Content-Type: application/json

--- request body ---
{"handle":"qa-73a13ee5dd77","displayName":"QA 73a13ee5dd77","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-09739262-2bf5-4141-9e5e-82b62bd9c8af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Location: /v1/accounts/qa-73a13ee5dd77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96ba0eb8-5d9a-44e0-9f89-d9ec1f5db4ab","handle":"qa-73a13ee5dd77","displayName":"QA 73a13ee5dd77","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.336345924Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d8b2cc2-2f98-4b50-82d4-ae4794ecb14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d8b2cc2-2f98-4b50-82d4-ae4794ecb14c
Content-Type: application/json

--- request body ---
{"handle":"qa-ff0d9b917fe6","displayName":"QA ff0d9b917fe6","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d8b2cc2-2f98-4b50-82d4-ae4794ecb14c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Location: /v1/accounts/qa-ff0d9b917fe6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3a237b46-6df3-4750-aed4-8981ec6586d2","handle":"qa-ff0d9b917fe6","displayName":"QA ff0d9b917fe6","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.386189321Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-383ee06e-3d92-4ba5-9fe6-0c2a71854d73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-383ee06e-3d92-4ba5-9fe6-0c2a71854d73
Content-Type: application/json

--- request body ---
{"handle":"qa-73a13ee5dd77","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-383ee06e-3d92-4ba5-9fe6-0c2a71854d73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96ba0eb8-5d9a-44e0-9f89-d9ec1f5db4ab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-74335a52-9340-42f5-a598-2432c1bcf530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74335a52-9340-42f5-a598-2432c1bcf530
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff0d9b917fe6","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-74335a52-9340-42f5-a598-2432c1bcf530
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
Location: /v1/conversations/cnv_831a7c85-077f-4456-8212-5baaaa66f189
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_831a7c85-077f-4456-8212-5baaaa66f189","subject":"Error contract","status":"open","region":"eu","participants":["qa-73a13ee5dd77","qa-ff0d9b917fe6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.500087657Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-52547120-8f7f-4557-9a91-d3b2e5ddc055

--- request headers ---
Accept: application/json
X-Fault-Key: 38f64b99-9c63-416d-89e0-d1bf8dd48256
X-Fault: unavailable-once
X-Correlation-Id: qa-52547120-8f7f-4557-9a91-d3b2e5ddc055
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73a13ee5dd77","subject":"Probe","message":"Hi"}

--- response: 503 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52547120-8f7f-4557-9a91-d3b2e5ddc055
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-52547120-8f7f-4557-9a91-d3b2e5ddc055"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac6d725b-55d8-40c2-9492-f112dd44886d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac6d725b-55d8-40c2-9492-f112dd44886d
Content-Type: application/json

--- request body ---
{"handle":"qa-ff0d9b917fe6","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac6d725b-55d8-40c2-9492-f112dd44886d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3a237b46-6df3-4750-aed4-8981ec6586d2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dc4ec86-9f2c-498b-a272-855aaa01ea3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dc4ec86-9f2c-498b-a272-855aaa01ea3a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dc4ec86-9f2c-498b-a272-855aaa01ea3a
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
correlation: qa-ab6c4b09-ca55-49ad-90fb-ea986c628ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab6c4b09-ca55-49ad-90fb-ea986c628ac6
Content-Type: application/json

--- request body ---
{"handle":"qa-ff0d9b917fe6","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab6c4b09-ca55-49ad-90fb-ea986c628ac6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ab6c4b09-ca55-49ad-90fb-ea986c628ac6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ef238b8-6f05-47e7-9c9f-66c61589b544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ef238b8-6f05-47e7-9c9f-66c61589b544
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ef238b8-6f05-47e7-9c9f-66c61589b544
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
correlation: qa-ba525fa0-e47e-4d60-a65b-88657a95686f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba525fa0-e47e-4d60-a65b-88657a95686f
Content-Type: application/json

--- request body ---
{"handle":"qa-73a13ee5dd77","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba525fa0-e47e-4d60-a65b-88657a95686f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba525fa0-e47e-4d60-a65b-88657a95686f"}
```
