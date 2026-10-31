# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-d75cd4d5-418c-45ba-b712-bf4ad143e396` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-c5f9ecb1-8377-4999-8eed-ac31c278df6c` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-972da811-bcd5-4015-86ae-4a1db9952762` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-c8f70945-d408-4cd0-9586-fefc267e9127` |
| 5 | `GET /v1/conversations/{id}` | 503 | 17 | `qa-ede38a11-091e-4e88-861d-1b033440e7d0` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-8813dc69-b122-4a71-8d73-c582ae3fc4d2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4a2d12d6-48a6-493d-aa69-a0fe0f9b9f5d` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-4012a564-36da-4577-b3b3-0b29b6b253fe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-8cbf6c57-91dd-46f2-8829-79800e3c3d01` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-4c660614-49c1-4ec4-937b-6c9b94335e2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d75cd4d5-418c-45ba-b712-bf4ad143e396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d75cd4d5-418c-45ba-b712-bf4ad143e396
Content-Type: application/json

--- request body ---
{"handle":"qa-93aec5322696","displayName":"QA 93aec5322696","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d75cd4d5-418c-45ba-b712-bf4ad143e396
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Location: /v1/accounts/qa-93aec5322696
X-Served-Region: eu
Content-Length: 181

{"id":"acc_516108a6-1cf9-46fc-9b36-a28c6f2d8302","handle":"qa-93aec5322696","displayName":"QA 93aec5322696","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.068453810Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c5f9ecb1-8377-4999-8eed-ac31c278df6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f9ecb1-8377-4999-8eed-ac31c278df6c
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb1419a2204","displayName":"QA 5bb1419a2204","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5f9ecb1-8377-4999-8eed-ac31c278df6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-5bb1419a2204
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f7f32c0-8f40-4697-862c-8524c504d5e5","handle":"qa-5bb1419a2204","displayName":"QA 5bb1419a2204","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.116169425Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-972da811-bcd5-4015-86ae-4a1db9952762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972da811-bcd5-4015-86ae-4a1db9952762
Content-Type: application/json

--- request body ---
{"handle":"qa-93aec5322696","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-972da811-bcd5-4015-86ae-4a1db9952762
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_516108a6-1cf9-46fc-9b36-a28c6f2d8302"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8f70945-d408-4cd0-9586-fefc267e9127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f70945-d408-4cd0-9586-fefc267e9127
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5bb1419a2204","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8f70945-d408-4cd0-9586-fefc267e9127
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
Location: /v1/conversations/cnv_ed0ded5b-3eb3-4d11-8113-28c7a25af709
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ed0ded5b-3eb3-4d11-8113-28c7a25af709","subject":"Error contract","status":"open","region":"eu","participants":["qa-93aec5322696","qa-5bb1419a2204"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.199618138Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ed0ded5b-3eb3-4d11-8113-28c7a25af709
correlation: qa-ede38a11-091e-4e88-861d-1b033440e7d0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: dc154e6a-639f-4d01-bd17-1856f1195730
X-Correlation-Id: qa-ede38a11-091e-4e88-861d-1b033440e7d0
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ede38a11-091e-4e88-861d-1b033440e7d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ed0ded5b-3eb3-4d11-8113-28c7a25af709","correlationId":"qa-ede38a11-091e-4e88-861d-1b033440e7d0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8813dc69-b122-4a71-8d73-c582ae3fc4d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8813dc69-b122-4a71-8d73-c582ae3fc4d2
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb1419a2204","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8813dc69-b122-4a71-8d73-c582ae3fc4d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f7f32c0-8f40-4697-862c-8524c504d5e5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a2d12d6-48a6-493d-aa69-a0fe0f9b9f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a2d12d6-48a6-493d-aa69-a0fe0f9b9f5d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a2d12d6-48a6-493d-aa69-a0fe0f9b9f5d
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
correlation: qa-4012a564-36da-4577-b3b3-0b29b6b253fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4012a564-36da-4577-b3b3-0b29b6b253fe
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb1419a2204","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4012a564-36da-4577-b3b3-0b29b6b253fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4012a564-36da-4577-b3b3-0b29b6b253fe"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cbf6c57-91dd-46f2-8829-79800e3c3d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cbf6c57-91dd-46f2-8829-79800e3c3d01
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cbf6c57-91dd-46f2-8829-79800e3c3d01
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
correlation: qa-4c660614-49c1-4ec4-937b-6c9b94335e2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c660614-49c1-4ec4-937b-6c9b94335e2e
Content-Type: application/json

--- request body ---
{"handle":"qa-93aec5322696","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c660614-49c1-4ec4-937b-6c9b94335e2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c660614-49c1-4ec4-937b-6c9b94335e2e"}
```
