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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-5a3d0f39-7721-41c0-956d-4165f1e7f325` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-d4a87533-d1a9-4d55-b6de-a9c5d4a54496` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-8d715577-b636-45cb-8364-2f9c63bba3c7` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-025c57c1-9cad-4306-afe4-f698d390ce3d` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 8 | `qa-08cce055-c628-40eb-8e12-7bc266e7a02b` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-22a64a0b-f1ad-4b03-ab50-fa54d401abb0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c40aea24-f74b-4533-99fd-39dcd69d16fe` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1765a647-2dd5-41cc-af65-f6143ed09bc7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4c49a5de-4f11-44f8-9b4a-0587e6955f85` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b46b5b98-bb09-4163-9d65-a9c68cd0b09e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a3d0f39-7721-41c0-956d-4165f1e7f325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a3d0f39-7721-41c0-956d-4165f1e7f325
Content-Type: application/json

--- request body ---
{"handle":"qa-8269e7cf2677","displayName":"QA 8269e7cf2677","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a3d0f39-7721-41c0-956d-4165f1e7f325
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
Location: /v1/accounts/qa-8269e7cf2677
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c16a9102-5433-4f1e-9cd5-11e922af1d61","handle":"qa-8269e7cf2677","displayName":"QA 8269e7cf2677","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.403659383Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d4a87533-d1a9-4d55-b6de-a9c5d4a54496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a87533-d1a9-4d55-b6de-a9c5d4a54496
Content-Type: application/json

--- request body ---
{"handle":"qa-332606ce1566","displayName":"QA 332606ce1566","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4a87533-d1a9-4d55-b6de-a9c5d4a54496
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Location: /v1/accounts/qa-332606ce1566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4fc1d79-03ad-4525-9acb-41f07693316e","handle":"qa-332606ce1566","displayName":"QA 332606ce1566","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.442739547Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8d715577-b636-45cb-8364-2f9c63bba3c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d715577-b636-45cb-8364-2f9c63bba3c7
Content-Type: application/json

--- request body ---
{"handle":"qa-8269e7cf2677","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d715577-b636-45cb-8364-2f9c63bba3c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c16a9102-5433-4f1e-9cd5-11e922af1d61"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-025c57c1-9cad-4306-afe4-f698d390ce3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025c57c1-9cad-4306-afe4-f698d390ce3d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-332606ce1566","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-025c57c1-9cad-4306-afe4-f698d390ce3d
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
Location: /v1/conversations/cnv_3ee12a5a-2c65-400f-9363-74cb5c066495
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ee12a5a-2c65-400f-9363-74cb5c066495","subject":"Error contract","status":"open","region":"eu","participants":["qa-8269e7cf2677","qa-332606ce1566"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.490192112Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-8269e7cf2677
correlation: qa-08cce055-c628-40eb-8e12-7bc266e7a02b

--- request headers ---
Accept: application/json
X-Fault-Key: dd318732-d109-41c1-99e4-e585f088cb26
X-Fault: unavailable-once
X-Correlation-Id: qa-08cce055-c628-40eb-8e12-7bc266e7a02b
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08cce055-c628-40eb-8e12-7bc266e7a02b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-8269e7cf2677","correlationId":"qa-08cce055-c628-40eb-8e12-7bc266e7a02b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-22a64a0b-f1ad-4b03-ab50-fa54d401abb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22a64a0b-f1ad-4b03-ab50-fa54d401abb0
Content-Type: application/json

--- request body ---
{"handle":"qa-332606ce1566","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-22a64a0b-f1ad-4b03-ab50-fa54d401abb0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4fc1d79-03ad-4525-9acb-41f07693316e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c40aea24-f74b-4533-99fd-39dcd69d16fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40aea24-f74b-4533-99fd-39dcd69d16fe
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c40aea24-f74b-4533-99fd-39dcd69d16fe
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
correlation: qa-1765a647-2dd5-41cc-af65-f6143ed09bc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1765a647-2dd5-41cc-af65-f6143ed09bc7
Content-Type: application/json

--- request body ---
{"handle":"qa-332606ce1566","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1765a647-2dd5-41cc-af65-f6143ed09bc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1765a647-2dd5-41cc-af65-f6143ed09bc7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c49a5de-4f11-44f8-9b4a-0587e6955f85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c49a5de-4f11-44f8-9b4a-0587e6955f85
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c49a5de-4f11-44f8-9b4a-0587e6955f85
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
correlation: qa-b46b5b98-bb09-4163-9d65-a9c68cd0b09e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46b5b98-bb09-4163-9d65-a9c68cd0b09e
Content-Type: application/json

--- request body ---
{"handle":"qa-8269e7cf2677","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b46b5b98-bb09-4163-9d65-a9c68cd0b09e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b46b5b98-bb09-4163-9d65-a9c68cd0b09e"}
```
