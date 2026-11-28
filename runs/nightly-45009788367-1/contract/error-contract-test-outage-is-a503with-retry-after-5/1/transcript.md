# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-98386e8e-9727-4822-b5a2-ba3d1cea7aab` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-29227470-1555-4b70-b21c-806a183d871d` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-fd856375-e876-44d8-a24e-524eca862a81` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-0c13215a-fd94-42e7-9206-90177004c81c` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 17 | `qa-6fdfd1fd-b96d-4609-8609-2023472f1727` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-cac5e865-a74a-4ead-890a-9803526e2242` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8f7b7042-96c2-43c1-aeed-cf5fc43c8c19` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-6a91a1e6-f3ad-4e28-a1ef-b30263a256cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4653daae-f405-489e-ba12-dc68dd9f2829` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-093ef2a1-8a84-45dc-b748-cf08a60bbc21` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-98386e8e-9727-4822-b5a2-ba3d1cea7aab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98386e8e-9727-4822-b5a2-ba3d1cea7aab
Content-Type: application/json

--- request body ---
{"handle":"qa-c7762357e068","displayName":"QA c7762357e068","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-98386e8e-9727-4822-b5a2-ba3d1cea7aab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Location: /v1/accounts/qa-c7762357e068
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034867d7-38a5-427b-8a09-20f5315bddfc","handle":"qa-c7762357e068","displayName":"QA c7762357e068","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.327765915Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-29227470-1555-4b70-b21c-806a183d871d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29227470-1555-4b70-b21c-806a183d871d
Content-Type: application/json

--- request body ---
{"handle":"qa-ce40a503c5b2","displayName":"QA ce40a503c5b2","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-29227470-1555-4b70-b21c-806a183d871d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 9
Location: /v1/accounts/qa-ce40a503c5b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8777c01-1d5f-4389-86a3-525b5ae27775","handle":"qa-ce40a503c5b2","displayName":"QA ce40a503c5b2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.366841561Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd856375-e876-44d8-a24e-524eca862a81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd856375-e876-44d8-a24e-524eca862a81
Content-Type: application/json

--- request body ---
{"handle":"qa-c7762357e068","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd856375-e876-44d8-a24e-524eca862a81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034867d7-38a5-427b-8a09-20f5315bddfc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0c13215a-fd94-42e7-9206-90177004c81c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c13215a-fd94-42e7-9206-90177004c81c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ce40a503c5b2","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c13215a-fd94-42e7-9206-90177004c81c
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
Location: /v1/conversations/cnv_8a38484c-139f-4e6d-8379-d2523a8f2bc2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a38484c-139f-4e6d-8379-d2523a8f2bc2","subject":"Error contract","status":"open","region":"eu","participants":["qa-c7762357e068","qa-ce40a503c5b2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.442494200Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-c7762357e068
correlation: qa-6fdfd1fd-b96d-4609-8609-2023472f1727

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c9ffa1ec-185a-42bb-b3fd-0a72d17e7226
X-Correlation-Id: qa-6fdfd1fd-b96d-4609-8609-2023472f1727
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fdfd1fd-b96d-4609-8609-2023472f1727
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-c7762357e068","correlationId":"qa-6fdfd1fd-b96d-4609-8609-2023472f1727"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cac5e865-a74a-4ead-890a-9803526e2242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac5e865-a74a-4ead-890a-9803526e2242
Content-Type: application/json

--- request body ---
{"handle":"qa-ce40a503c5b2","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac5e865-a74a-4ead-890a-9803526e2242
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8777c01-1d5f-4389-86a3-525b5ae27775"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f7b7042-96c2-43c1-aeed-cf5fc43c8c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f7b7042-96c2-43c1-aeed-cf5fc43c8c19
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f7b7042-96c2-43c1-aeed-cf5fc43c8c19
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
correlation: qa-6a91a1e6-f3ad-4e28-a1ef-b30263a256cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a91a1e6-f3ad-4e28-a1ef-b30263a256cd
Content-Type: application/json

--- request body ---
{"handle":"qa-ce40a503c5b2","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a91a1e6-f3ad-4e28-a1ef-b30263a256cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a91a1e6-f3ad-4e28-a1ef-b30263a256cd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4653daae-f405-489e-ba12-dc68dd9f2829

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4653daae-f405-489e-ba12-dc68dd9f2829
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4653daae-f405-489e-ba12-dc68dd9f2829
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
correlation: qa-093ef2a1-8a84-45dc-b748-cf08a60bbc21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093ef2a1-8a84-45dc-b748-cf08a60bbc21
Content-Type: application/json

--- request body ---
{"handle":"qa-c7762357e068","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-093ef2a1-8a84-45dc-b748-cf08a60bbc21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-093ef2a1-8a84-45dc-b748-cf08a60bbc21"}
```
