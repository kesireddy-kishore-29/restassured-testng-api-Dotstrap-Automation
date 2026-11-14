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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-cddab930-3575-4b9e-85c5-0f37d44976b6` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-cb0626c2-7205-44ab-94a0-acd701fbee15` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-60ef701d-a777-40f2-b106-4fb6942e14c2` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-8a9ec449-da38-4fce-b6d8-bdd910f73b3a` |
| 5 | `GET /v1/accounts/me` | 503 | 29 | `qa-845b8090-0708-4a5f-8260-23682bfca4ce` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-905c04d4-16ec-4ee3-8168-7f140941b8fe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 64 | `qa-5dde8f34-f1a7-409c-9c1a-577be82a9d8c` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-ccf1388f-29c3-4113-9ac8-cdf63c39137f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-49e581dc-e7e2-4344-9260-b07846aed64d` |
| 10 | `POST /v1/auth/token` | 401 | 42 | `qa-e5ed2555-5bf6-44f3-84cb-42ca0b1830ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cddab930-3575-4b9e-85c5-0f37d44976b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cddab930-3575-4b9e-85c5-0f37d44976b6
Content-Type: application/json

--- request body ---
{"handle":"qa-42740e229344","displayName":"QA 42740e229344","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cddab930-3575-4b9e-85c5-0f37d44976b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-42740e229344
X-Served-Region: eu
Content-Length: 181

{"id":"acc_362a43b9-8709-4fb6-b1c2-02a313d96767","handle":"qa-42740e229344","displayName":"QA 42740e229344","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.102274839Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb0626c2-7205-44ab-94a0-acd701fbee15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0626c2-7205-44ab-94a0-acd701fbee15
Content-Type: application/json

--- request body ---
{"handle":"qa-7c624093ceb4","displayName":"QA 7c624093ceb4","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb0626c2-7205-44ab-94a0-acd701fbee15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-7c624093ceb4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59d75ff8-630d-40c8-b1f3-87b8c2ae158f","handle":"qa-7c624093ceb4","displayName":"QA 7c624093ceb4","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.150761413Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-60ef701d-a777-40f2-b106-4fb6942e14c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ef701d-a777-40f2-b106-4fb6942e14c2
Content-Type: application/json

--- request body ---
{"handle":"qa-42740e229344","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-60ef701d-a777-40f2-b106-4fb6942e14c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_362a43b9-8709-4fb6-b1c2-02a313d96767"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8a9ec449-da38-4fce-b6d8-bdd910f73b3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a9ec449-da38-4fce-b6d8-bdd910f73b3a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7c624093ceb4","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a9ec449-da38-4fce-b6d8-bdd910f73b3a
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
Location: /v1/conversations/cnv_73a5b2bd-be35-4e90-a4ee-3bd3b7988376
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_73a5b2bd-be35-4e90-a4ee-3bd3b7988376","subject":"Error contract","status":"open","region":"eu","participants":["qa-42740e229344","qa-7c624093ceb4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.221566225Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-845b8090-0708-4a5f-8260-23682bfca4ce

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 82161832-caf7-4844-aef2-374afe44ebfe
X-Correlation-Id: qa-845b8090-0708-4a5f-8260-23682bfca4ce
Content-Type: application/json

--- response: 503 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-845b8090-0708-4a5f-8260-23682bfca4ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-845b8090-0708-4a5f-8260-23682bfca4ce"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-905c04d4-16ec-4ee3-8168-7f140941b8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905c04d4-16ec-4ee3-8168-7f140941b8fe
Content-Type: application/json

--- request body ---
{"handle":"qa-7c624093ceb4","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-905c04d4-16ec-4ee3-8168-7f140941b8fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59d75ff8-630d-40c8-b1f3-87b8c2ae158f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5dde8f34-f1a7-409c-9c1a-577be82a9d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dde8f34-f1a7-409c-9c1a-577be82a9d8c
Content-Type: application/json

--- response: 204 in 64 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5dde8f34-f1a7-409c-9c1a-577be82a9d8c
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
correlation: qa-ccf1388f-29c3-4113-9ac8-cdf63c39137f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf1388f-29c3-4113-9ac8-cdf63c39137f
Content-Type: application/json

--- request body ---
{"handle":"qa-7c624093ceb4","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccf1388f-29c3-4113-9ac8-cdf63c39137f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccf1388f-29c3-4113-9ac8-cdf63c39137f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49e581dc-e7e2-4344-9260-b07846aed64d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49e581dc-e7e2-4344-9260-b07846aed64d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49e581dc-e7e2-4344-9260-b07846aed64d
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
correlation: qa-e5ed2555-5bf6-44f3-84cb-42ca0b1830ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5ed2555-5bf6-44f3-84cb-42ca0b1830ce
Content-Type: application/json

--- request body ---
{"handle":"qa-42740e229344","password":"****"}

--- response: 401 in 42 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5ed2555-5bf6-44f3-84cb-42ca0b1830ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5ed2555-5bf6-44f3-84cb-42ca0b1830ce"}
```
