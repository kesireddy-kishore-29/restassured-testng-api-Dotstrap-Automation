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
| 1 | `POST /v1/accounts` | 201 | 489 | `qa-5694abcd-3765-45d2-baba-885679c12ba9` |
| 2 | `POST /v1/accounts` | 201 | 78 | `qa-88c23ff2-9caa-472a-96c4-c9a18c06e2b3` |
| 3 | `POST /v1/auth/token` | 200 | 101 | `qa-7f4bc6be-e9b4-4dfb-880a-4a61f2098e04` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-1b1bbe87-7ccc-4008-9178-bf8c2478f4d6` |
| 5 | `GET /v1/accounts/me` | 503 | 26 | `qa-64ed1578-c4fa-47b8-95de-a851f24ab6c9` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-31d75c96-e681-4280-8df9-aa75e50fbc85` |
| 7 | `DELETE /v1/accounts/me` | 204 | 58 | `qa-d8f5745a-fd30-4f96-9795-c4581d7e5734` |
| 8 | `POST /v1/auth/token` | 401 | 54 | `qa-2255d0d3-e9a7-4b24-9bfb-e9b27c037e6b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-76d8ab70-6d07-4b0a-bade-e6fe64925642` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-3c7b1fc0-c5f0-44a9-a4ca-a7a0c61770c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5694abcd-3765-45d2-baba-885679c12ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5694abcd-3765-45d2-baba-885679c12ba9
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ba99425587","displayName":"QA f1ba99425587","password":"****","region":"eu"}

--- response: 201 in 489 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5694abcd-3765-45d2-baba-885679c12ba9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-f1ba99425587
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13fa747f-ae81-4fbe-b773-b664b5778dd9","handle":"qa-f1ba99425587","displayName":"QA f1ba99425587","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.422710276Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-88c23ff2-9caa-472a-96c4-c9a18c06e2b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c23ff2-9caa-472a-96c4-c9a18c06e2b3
Content-Type: application/json

--- request body ---
{"handle":"qa-97c97f5438b2","displayName":"QA 97c97f5438b2","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-88c23ff2-9caa-472a-96c4-c9a18c06e2b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-97c97f5438b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a396bf29-26a2-41be-b6d0-3338c5b1299b","handle":"qa-97c97f5438b2","displayName":"QA 97c97f5438b2","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.897141656Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7f4bc6be-e9b4-4dfb-880a-4a61f2098e04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f4bc6be-e9b4-4dfb-880a-4a61f2098e04
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ba99425587","password":"****"}

--- response: 200 in 101 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f4bc6be-e9b4-4dfb-880a-4a61f2098e04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13fa747f-ae81-4fbe-b773-b664b5778dd9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1b1bbe87-7ccc-4008-9178-bf8c2478f4d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b1bbe87-7ccc-4008-9178-bf8c2478f4d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-97c97f5438b2","subject":"Error contract","message":"Hi"}

--- response: 201 in 69 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b1bbe87-7ccc-4008-9178-bf8c2478f4d6
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
Location: /v1/conversations/cnv_8f464b45-a4f5-4265-9dcc-de160429dc1e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8f464b45-a4f5-4265-9dcc-de160429dc1e","subject":"Error contract","status":"open","region":"eu","participants":["qa-f1ba99425587","qa-97c97f5438b2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.202162168Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-64ed1578-c4fa-47b8-95de-a851f24ab6c9

--- request headers ---
Accept: application/json
X-Fault-Key: c51914d2-5607-4f5a-a0f3-f545e757fc41
X-Fault: unavailable-once
X-Correlation-Id: qa-64ed1578-c4fa-47b8-95de-a851f24ab6c9
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64ed1578-c4fa-47b8-95de-a851f24ab6c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-64ed1578-c4fa-47b8-95de-a851f24ab6c9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-31d75c96-e681-4280-8df9-aa75e50fbc85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31d75c96-e681-4280-8df9-aa75e50fbc85
Content-Type: application/json

--- request body ---
{"handle":"qa-97c97f5438b2","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-31d75c96-e681-4280-8df9-aa75e50fbc85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a396bf29-26a2-41be-b6d0-3338c5b1299b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8f5745a-fd30-4f96-9795-c4581d7e5734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f5745a-fd30-4f96-9795-c4581d7e5734
Content-Type: application/json

--- response: 204 in 58 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8f5745a-fd30-4f96-9795-c4581d7e5734
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
correlation: qa-2255d0d3-e9a7-4b24-9bfb-e9b27c037e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2255d0d3-e9a7-4b24-9bfb-e9b27c037e6b
Content-Type: application/json

--- request body ---
{"handle":"qa-97c97f5438b2","password":"****"}

--- response: 401 in 54 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2255d0d3-e9a7-4b24-9bfb-e9b27c037e6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2255d0d3-e9a7-4b24-9bfb-e9b27c037e6b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76d8ab70-6d07-4b0a-bade-e6fe64925642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d8ab70-6d07-4b0a-bade-e6fe64925642
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76d8ab70-6d07-4b0a-bade-e6fe64925642
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
correlation: qa-3c7b1fc0-c5f0-44a9-a4ca-a7a0c61770c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c7b1fc0-c5f0-44a9-a4ca-a7a0c61770c4
Content-Type: application/json

--- request body ---
{"handle":"qa-f1ba99425587","password":"****"}

--- response: 401 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c7b1fc0-c5f0-44a9-a4ca-a7a0c61770c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c7b1fc0-c5f0-44a9-a4ca-a7a0c61770c4"}
```
