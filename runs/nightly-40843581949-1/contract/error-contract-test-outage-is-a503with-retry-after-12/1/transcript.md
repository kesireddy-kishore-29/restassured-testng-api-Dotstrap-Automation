# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-d71b36a3-db49-4fa0-a226-e5c0d48bdf4a` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-04e56160-d909-4ee0-a50a-6ca37934d125` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-c87e8291-9377-44b3-8b3e-7b930da76924` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-611d0287-1ec1-45f0-a176-398c6dbba837` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 19 | `qa-331f9993-061b-4d2b-afd0-e0ed0f7b69b9` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-fe35625a-126a-4dd2-8aed-6f4772236ce1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3b784cbe-aa40-444e-951c-e5adf515b543` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-52781993-c469-4d29-a3e9-1ca7c7c2b12d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-36569ac7-9ada-49c1-9210-dd45c6807559` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-38b1a412-8e30-454a-9962-7416a57a3147` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d71b36a3-db49-4fa0-a226-e5c0d48bdf4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d71b36a3-db49-4fa0-a226-e5c0d48bdf4a
Content-Type: application/json

--- request body ---
{"handle":"qa-e193758bd1c3","displayName":"QA e193758bd1c3","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d71b36a3-db49-4fa0-a226-e5c0d48bdf4a
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
Location: /v1/accounts/qa-e193758bd1c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a19aeae0-34ba-4d8c-926d-21f68a746190","handle":"qa-e193758bd1c3","displayName":"QA e193758bd1c3","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.895807676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04e56160-d909-4ee0-a50a-6ca37934d125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e56160-d909-4ee0-a50a-6ca37934d125
Content-Type: application/json

--- request body ---
{"handle":"qa-1869e4df9628","displayName":"QA 1869e4df9628","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-04e56160-d909-4ee0-a50a-6ca37934d125
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Location: /v1/accounts/qa-1869e4df9628
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a05280de-7b9b-480f-887a-6e4bc1781880","handle":"qa-1869e4df9628","displayName":"QA 1869e4df9628","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.939204714Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c87e8291-9377-44b3-8b3e-7b930da76924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c87e8291-9377-44b3-8b3e-7b930da76924
Content-Type: application/json

--- request body ---
{"handle":"qa-e193758bd1c3","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c87e8291-9377-44b3-8b3e-7b930da76924
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a19aeae0-34ba-4d8c-926d-21f68a746190"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-611d0287-1ec1-45f0-a176-398c6dbba837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-611d0287-1ec1-45f0-a176-398c6dbba837
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1869e4df9628","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-611d0287-1ec1-45f0-a176-398c6dbba837
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
Location: /v1/conversations/cnv_2a977319-135d-4e34-8512-6270ff8d5b9f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a977319-135d-4e34-8512-6270ff8d5b9f","subject":"Error contract","status":"open","region":"eu","participants":["qa-e193758bd1c3","qa-1869e4df9628"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.026773219Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2a977319-135d-4e34-8512-6270ff8d5b9f/close
correlation: qa-331f9993-061b-4d2b-afd0-e0ed0f7b69b9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 97d1be1b-43f2-4dc4-987a-e7d4b79bfdff
X-Correlation-Id: qa-331f9993-061b-4d2b-afd0-e0ed0f7b69b9
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-331f9993-061b-4d2b-afd0-e0ed0f7b69b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2a977319-135d-4e34-8512-6270ff8d5b9f/close","correlationId":"qa-331f9993-061b-4d2b-afd0-e0ed0f7b69b9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe35625a-126a-4dd2-8aed-6f4772236ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe35625a-126a-4dd2-8aed-6f4772236ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-1869e4df9628","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe35625a-126a-4dd2-8aed-6f4772236ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a05280de-7b9b-480f-887a-6e4bc1781880"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b784cbe-aa40-444e-951c-e5adf515b543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b784cbe-aa40-444e-951c-e5adf515b543
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b784cbe-aa40-444e-951c-e5adf515b543
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
correlation: qa-52781993-c469-4d29-a3e9-1ca7c7c2b12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52781993-c469-4d29-a3e9-1ca7c7c2b12d
Content-Type: application/json

--- request body ---
{"handle":"qa-1869e4df9628","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52781993-c469-4d29-a3e9-1ca7c7c2b12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52781993-c469-4d29-a3e9-1ca7c7c2b12d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-36569ac7-9ada-49c1-9210-dd45c6807559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36569ac7-9ada-49c1-9210-dd45c6807559
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-36569ac7-9ada-49c1-9210-dd45c6807559
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
correlation: qa-38b1a412-8e30-454a-9962-7416a57a3147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b1a412-8e30-454a-9962-7416a57a3147
Content-Type: application/json

--- request body ---
{"handle":"qa-e193758bd1c3","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38b1a412-8e30-454a-9962-7416a57a3147
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38b1a412-8e30-454a-9962-7416a57a3147"}
```
