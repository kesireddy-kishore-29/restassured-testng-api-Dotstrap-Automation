# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-251bff0b-d1a1-4f3b-a42a-bebf677b6823` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-42fb7f8e-6be9-4a7f-b53b-12b55cd39208` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-a76b195a-29b4-405c-9e4e-135b2ec7bbc0` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-2d2dc2b9-9653-4739-ab7d-b6a71644f9bb` |
| 5 | `GET /v1/conversations` | 503 | 17 | `qa-57d6d65b-8445-4438-b6d7-e8a596bac3c8` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-f5ab8540-356c-4ecf-b059-80ed99b25163` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-19ed4ea2-057c-4d07-ad1c-8b261a293c66` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-88cd6df5-cead-4d08-9d1d-9097fc0e751c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-577bb273-38cc-41ea-972a-2e7a9202c9ba` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-84cad2b5-80ba-43e4-ab3a-08b752c93047` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-251bff0b-d1a1-4f3b-a42a-bebf677b6823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-251bff0b-d1a1-4f3b-a42a-bebf677b6823
Content-Type: application/json

--- request body ---
{"handle":"qa-e65243c951a0","displayName":"QA e65243c951a0","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-251bff0b-d1a1-4f3b-a42a-bebf677b6823
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-e65243c951a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd586f54-7638-4397-a5f9-6b3af8565e99","handle":"qa-e65243c951a0","displayName":"QA e65243c951a0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.202051295Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42fb7f8e-6be9-4a7f-b53b-12b55cd39208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fb7f8e-6be9-4a7f-b53b-12b55cd39208
Content-Type: application/json

--- request body ---
{"handle":"qa-8febbbbe8817","displayName":"QA 8febbbbe8817","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-42fb7f8e-6be9-4a7f-b53b-12b55cd39208
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-8febbbbe8817
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6469a972-26b9-477b-b8fa-d4e96abe7027","handle":"qa-8febbbbe8817","displayName":"QA 8febbbbe8817","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.258952018Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a76b195a-29b4-405c-9e4e-135b2ec7bbc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76b195a-29b4-405c-9e4e-135b2ec7bbc0
Content-Type: application/json

--- request body ---
{"handle":"qa-e65243c951a0","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a76b195a-29b4-405c-9e4e-135b2ec7bbc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd586f54-7638-4397-a5f9-6b3af8565e99"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2d2dc2b9-9653-4739-ab7d-b6a71644f9bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d2dc2b9-9653-4739-ab7d-b6a71644f9bb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8febbbbe8817","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d2dc2b9-9653-4739-ab7d-b6a71644f9bb
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
Location: /v1/conversations/cnv_a8aa8364-edf4-4715-abb8-8d54b9cd8f5b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a8aa8364-edf4-4715-abb8-8d54b9cd8f5b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e65243c951a0","qa-8febbbbe8817"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.395011534Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-57d6d65b-8445-4438-b6d7-e8a596bac3c8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 245c5bb4-9598-4bac-b949-fc5d63186395
X-Correlation-Id: qa-57d6d65b-8445-4438-b6d7-e8a596bac3c8
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57d6d65b-8445-4438-b6d7-e8a596bac3c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-57d6d65b-8445-4438-b6d7-e8a596bac3c8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5ab8540-356c-4ecf-b059-80ed99b25163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5ab8540-356c-4ecf-b059-80ed99b25163
Content-Type: application/json

--- request body ---
{"handle":"qa-8febbbbe8817","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5ab8540-356c-4ecf-b059-80ed99b25163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6469a972-26b9-477b-b8fa-d4e96abe7027"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19ed4ea2-057c-4d07-ad1c-8b261a293c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ed4ea2-057c-4d07-ad1c-8b261a293c66
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19ed4ea2-057c-4d07-ad1c-8b261a293c66
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
correlation: qa-88cd6df5-cead-4d08-9d1d-9097fc0e751c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88cd6df5-cead-4d08-9d1d-9097fc0e751c
Content-Type: application/json

--- request body ---
{"handle":"qa-8febbbbe8817","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88cd6df5-cead-4d08-9d1d-9097fc0e751c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88cd6df5-cead-4d08-9d1d-9097fc0e751c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-577bb273-38cc-41ea-972a-2e7a9202c9ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577bb273-38cc-41ea-972a-2e7a9202c9ba
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-577bb273-38cc-41ea-972a-2e7a9202c9ba
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
correlation: qa-84cad2b5-80ba-43e4-ab3a-08b752c93047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84cad2b5-80ba-43e4-ab3a-08b752c93047
Content-Type: application/json

--- request body ---
{"handle":"qa-e65243c951a0","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84cad2b5-80ba-43e4-ab3a-08b752c93047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84cad2b5-80ba-43e4-ab3a-08b752c93047"}
```
