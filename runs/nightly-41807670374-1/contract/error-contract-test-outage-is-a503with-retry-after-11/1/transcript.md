# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-951852a9-48f8-4231-b4d4-d35055617fe4` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-b9f80647-e717-4877-89a4-83f13e3da65a` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-67d22172-9830-4694-9c1d-b04a80ffdd6c` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-a9b9c687-b049-40f9-8978-3b9ba87a3e59` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 10 | `qa-74ee0229-f206-447d-b9de-36e7f4983f0b` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-d655d83a-5ae8-40c7-898e-3c601d192ba9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5749c911-8d68-44cf-8e51-97bdb2fd7db6` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-654846f4-c91c-4885-ab1f-bca132858201` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fa3827fd-fcef-4b23-b1bc-ef45ee5f6e20` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-40dfa3c2-30bd-49d7-b8c0-f21702cdbe10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-951852a9-48f8-4231-b4d4-d35055617fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951852a9-48f8-4231-b4d4-d35055617fe4
Content-Type: application/json

--- request body ---
{"handle":"qa-ea98f9bec142","displayName":"QA ea98f9bec142","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-951852a9-48f8-4231-b4d4-d35055617fe4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 9
Location: /v1/accounts/qa-ea98f9bec142
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c8cc407-7df9-4d99-94e0-141e09ee4102","handle":"qa-ea98f9bec142","displayName":"QA ea98f9bec142","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.896551087Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b9f80647-e717-4877-89a4-83f13e3da65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f80647-e717-4877-89a4-83f13e3da65a
Content-Type: application/json

--- request body ---
{"handle":"qa-c7d7c82b9826","displayName":"QA c7d7c82b9826","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f80647-e717-4877-89a4-83f13e3da65a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 9
Location: /v1/accounts/qa-c7d7c82b9826
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9fabc380-3216-470f-b6fd-2e8ff3b6d2d7","handle":"qa-c7d7c82b9826","displayName":"QA c7d7c82b9826","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.925312790Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-67d22172-9830-4694-9c1d-b04a80ffdd6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67d22172-9830-4694-9c1d-b04a80ffdd6c
Content-Type: application/json

--- request body ---
{"handle":"qa-ea98f9bec142","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-67d22172-9830-4694-9c1d-b04a80ffdd6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c8cc407-7df9-4d99-94e0-141e09ee4102"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9b9c687-b049-40f9-8978-3b9ba87a3e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9b9c687-b049-40f9-8978-3b9ba87a3e59
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7d7c82b9826","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9b9c687-b049-40f9-8978-3b9ba87a3e59
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
Location: /v1/conversations/cnv_435d146d-3318-4e21-8085-25e8ed372287
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_435d146d-3318-4e21-8085-25e8ed372287","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea98f9bec142","qa-c7d7c82b9826"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.980159861Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_435d146d-3318-4e21-8085-25e8ed372287/read
correlation: qa-74ee0229-f206-447d-b9de-36e7f4983f0b

--- request headers ---
Accept: application/json
X-Fault-Key: dca5b024-b5e4-4f32-9dc3-527d68ca52bc
X-Fault: unavailable-once
X-Correlation-Id: qa-74ee0229-f206-447d-b9de-36e7f4983f0b
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74ee0229-f206-447d-b9de-36e7f4983f0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_435d146d-3318-4e21-8085-25e8ed372287/read","correlationId":"qa-74ee0229-f206-447d-b9de-36e7f4983f0b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d655d83a-5ae8-40c7-898e-3c601d192ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d655d83a-5ae8-40c7-898e-3c601d192ba9
Content-Type: application/json

--- request body ---
{"handle":"qa-c7d7c82b9826","password":"****"}

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d655d83a-5ae8-40c7-898e-3c601d192ba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9fabc380-3216-470f-b6fd-2e8ff3b6d2d7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5749c911-8d68-44cf-8e51-97bdb2fd7db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5749c911-8d68-44cf-8e51-97bdb2fd7db6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5749c911-8d68-44cf-8e51-97bdb2fd7db6
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
correlation: qa-654846f4-c91c-4885-ab1f-bca132858201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654846f4-c91c-4885-ab1f-bca132858201
Content-Type: application/json

--- request body ---
{"handle":"qa-c7d7c82b9826","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-654846f4-c91c-4885-ab1f-bca132858201
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-654846f4-c91c-4885-ab1f-bca132858201"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa3827fd-fcef-4b23-b1bc-ef45ee5f6e20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3827fd-fcef-4b23-b1bc-ef45ee5f6e20
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa3827fd-fcef-4b23-b1bc-ef45ee5f6e20
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
correlation: qa-40dfa3c2-30bd-49d7-b8c0-f21702cdbe10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40dfa3c2-30bd-49d7-b8c0-f21702cdbe10
Content-Type: application/json

--- request body ---
{"handle":"qa-ea98f9bec142","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40dfa3c2-30bd-49d7-b8c0-f21702cdbe10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40dfa3c2-30bd-49d7-b8c0-f21702cdbe10"}
```
