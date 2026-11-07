# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-e1cf5fb2-8143-4058-924a-65b45f6ed5e3` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-5830a482-2553-4bf8-bf65-a47d367183b6` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-76ae4f34-44e3-4533-9c09-0e081746ca0e` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-22e39e73-08d7-4ca5-b040-1d69bb3215b9` |
| 5 | `POST /v1/auth/token` | 400 | 38 | `qa-011ed708-3217-4d44-ac62-2095ea0dd334` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-9c41b85d-c241-4595-985c-5348c036b20e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-469fd815-9eb0-4b71-9769-ce55421234ae` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-9d6816f8-60a4-4999-aabd-ab616dffbf15` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f7a39d71-73f3-443e-8a38-3629e36a14bf` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-4ef74123-2339-4974-ae93-0bcc8ca231ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1cf5fb2-8143-4058-924a-65b45f6ed5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1cf5fb2-8143-4058-924a-65b45f6ed5e3
Content-Type: application/json

--- request body ---
{"handle":"qa-b51d2497b922","displayName":"QA b51d2497b922","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1cf5fb2-8143-4058-924a-65b45f6ed5e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-b51d2497b922
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ffcc69ed-4131-4c26-b7c7-f5e4713e0550","handle":"qa-b51d2497b922","displayName":"QA b51d2497b922","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.038101244Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5830a482-2553-4bf8-bf65-a47d367183b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5830a482-2553-4bf8-bf65-a47d367183b6
Content-Type: application/json

--- request body ---
{"handle":"qa-b3e3bbaf9f41","displayName":"QA b3e3bbaf9f41","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5830a482-2553-4bf8-bf65-a47d367183b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-b3e3bbaf9f41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a362b0e9-6ba1-4353-b015-aa6a65c719d3","handle":"qa-b3e3bbaf9f41","displayName":"QA b3e3bbaf9f41","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.409777793Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-76ae4f34-44e3-4533-9c09-0e081746ca0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ae4f34-44e3-4533-9c09-0e081746ca0e
Content-Type: application/json

--- request body ---
{"handle":"qa-b51d2497b922","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-76ae4f34-44e3-4533-9c09-0e081746ca0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffcc69ed-4131-4c26-b7c7-f5e4713e0550"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-22e39e73-08d7-4ca5-b040-1d69bb3215b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e39e73-08d7-4ca5-b040-1d69bb3215b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b3e3bbaf9f41","subject":"Error contract","message":"Hi"}

--- response: 201 in 58 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-22e39e73-08d7-4ca5-b040-1d69bb3215b9
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
Location: /v1/conversations/cnv_58eb724f-4070-47f7-8988-8fcb916acf46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_58eb724f-4070-47f7-8988-8fcb916acf46","subject":"Error contract","status":"open","region":"eu","participants":["qa-b51d2497b922","qa-b3e3bbaf9f41"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526058195Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-011ed708-3217-4d44-ac62-2095ea0dd334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-011ed708-3217-4d44-ac62-2095ea0dd334
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-011ed708-3217-4d44-ac62-2095ea0dd334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-011ed708-3217-4d44-ac62-2095ea0dd334"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9c41b85d-c241-4595-985c-5348c036b20e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c41b85d-c241-4595-985c-5348c036b20e
Content-Type: application/json

--- request body ---
{"handle":"qa-b3e3bbaf9f41","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c41b85d-c241-4595-985c-5348c036b20e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a362b0e9-6ba1-4353-b015-aa6a65c719d3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-469fd815-9eb0-4b71-9769-ce55421234ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-469fd815-9eb0-4b71-9769-ce55421234ae
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-469fd815-9eb0-4b71-9769-ce55421234ae
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
correlation: qa-9d6816f8-60a4-4999-aabd-ab616dffbf15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d6816f8-60a4-4999-aabd-ab616dffbf15
Content-Type: application/json

--- request body ---
{"handle":"qa-b3e3bbaf9f41","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d6816f8-60a4-4999-aabd-ab616dffbf15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d6816f8-60a4-4999-aabd-ab616dffbf15"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7a39d71-73f3-443e-8a38-3629e36a14bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7a39d71-73f3-443e-8a38-3629e36a14bf
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7a39d71-73f3-443e-8a38-3629e36a14bf
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
correlation: qa-4ef74123-2339-4974-ae93-0bcc8ca231ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef74123-2339-4974-ae93-0bcc8ca231ab
Content-Type: application/json

--- request body ---
{"handle":"qa-b51d2497b922","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ef74123-2339-4974-ae93-0bcc8ca231ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ef74123-2339-4974-ae93-0bcc8ca231ab"}
```
