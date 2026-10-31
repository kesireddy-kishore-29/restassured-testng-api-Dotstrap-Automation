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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-741def15-ccca-48a8-9bdc-84c555f44e55` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-e0c7268a-1f60-41b0-a329-8961dcb61dd4` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-ae2fb50b-983f-474d-9ad5-6f4a3a961f71` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-62373f7a-2924-452b-b736-475c40b834dd` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 13 | `qa-fff81e8b-03cd-4d16-b796-1e3798d9dc7d` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-3907cbeb-8e25-48f5-9236-8d9a1558586b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3fd18b41-ce2e-434c-b169-faf4567deb04` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-bb8bca4b-7888-4d11-8715-a2cc6eca344b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a34b6200-9cdb-4421-956d-6cc5a9331b60` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-9d026a5b-b5b6-4fef-bfe4-066628a503fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-741def15-ccca-48a8-9bdc-84c555f44e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-741def15-ccca-48a8-9bdc-84c555f44e55
Content-Type: application/json

--- request body ---
{"handle":"qa-9e698bfb1b6f","displayName":"QA 9e698bfb1b6f","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-741def15-ccca-48a8-9bdc-84c555f44e55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Location: /v1/accounts/qa-9e698bfb1b6f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af2ee499-c558-4b12-b841-5dcb51cfadf1","handle":"qa-9e698bfb1b6f","displayName":"QA 9e698bfb1b6f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.022392817Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e0c7268a-1f60-41b0-a329-8961dcb61dd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0c7268a-1f60-41b0-a329-8961dcb61dd4
Content-Type: application/json

--- request body ---
{"handle":"qa-bb89c74dade4","displayName":"QA bb89c74dade4","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0c7268a-1f60-41b0-a329-8961dcb61dd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Location: /v1/accounts/qa-bb89c74dade4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3549d079-d9f6-4b47-8395-8485649ae71c","handle":"qa-bb89c74dade4","displayName":"QA bb89c74dade4","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.052250170Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ae2fb50b-983f-474d-9ad5-6f4a3a961f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2fb50b-983f-474d-9ad5-6f4a3a961f71
Content-Type: application/json

--- request body ---
{"handle":"qa-9e698bfb1b6f","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae2fb50b-983f-474d-9ad5-6f4a3a961f71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af2ee499-c558-4b12-b841-5dcb51cfadf1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-62373f7a-2924-452b-b736-475c40b834dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62373f7a-2924-452b-b736-475c40b834dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bb89c74dade4","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-62373f7a-2924-452b-b736-475c40b834dd
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
Location: /v1/conversations/cnv_3028cdbc-0859-4cbe-8036-b93d7194c0ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3028cdbc-0859-4cbe-8036-b93d7194c0ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-9e698bfb1b6f","qa-bb89c74dade4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.091313258Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3028cdbc-0859-4cbe-8036-b93d7194c0ca/close
correlation: qa-fff81e8b-03cd-4d16-b796-1e3798d9dc7d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fcaf3a23-cc33-4e55-8f53-434f5425fc17
X-Correlation-Id: qa-fff81e8b-03cd-4d16-b796-1e3798d9dc7d
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fff81e8b-03cd-4d16-b796-1e3798d9dc7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_3028cdbc-0859-4cbe-8036-b93d7194c0ca/close","correlationId":"qa-fff81e8b-03cd-4d16-b796-1e3798d9dc7d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3907cbeb-8e25-48f5-9236-8d9a1558586b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3907cbeb-8e25-48f5-9236-8d9a1558586b
Content-Type: application/json

--- request body ---
{"handle":"qa-bb89c74dade4","password":"****"}

--- response: 200 in 47 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3907cbeb-8e25-48f5-9236-8d9a1558586b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3549d079-d9f6-4b47-8395-8485649ae71c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fd18b41-ce2e-434c-b169-faf4567deb04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd18b41-ce2e-434c-b169-faf4567deb04
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fd18b41-ce2e-434c-b169-faf4567deb04
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
correlation: qa-bb8bca4b-7888-4d11-8715-a2cc6eca344b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8bca4b-7888-4d11-8715-a2cc6eca344b
Content-Type: application/json

--- request body ---
{"handle":"qa-bb89c74dade4","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb8bca4b-7888-4d11-8715-a2cc6eca344b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb8bca4b-7888-4d11-8715-a2cc6eca344b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a34b6200-9cdb-4421-956d-6cc5a9331b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34b6200-9cdb-4421-956d-6cc5a9331b60
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a34b6200-9cdb-4421-956d-6cc5a9331b60
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
correlation: qa-9d026a5b-b5b6-4fef-bfe4-066628a503fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d026a5b-b5b6-4fef-bfe4-066628a503fe
Content-Type: application/json

--- request body ---
{"handle":"qa-9e698bfb1b6f","password":"****"}

--- response: 401 in 33 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d026a5b-b5b6-4fef-bfe4-066628a503fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d026a5b-b5b6-4fef-bfe4-066628a503fe"}
```
