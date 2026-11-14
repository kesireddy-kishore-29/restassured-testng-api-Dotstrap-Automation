# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-834bd077-d860-4ceb-ae7e-10a36722767d` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-bf8bb1e5-5728-465f-8b84-e6ac1362729d` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-97cceb12-bbcb-4fa4-8efa-eaee5515d335` |
| 4 | `POST /v1/conversations` | 201 | 44 | `qa-564c2ffe-a44c-4d27-822b-e8ce9cc5a057` |
| 5 | `POST /v1/accounts` | 503 | 37 | `qa-8a7d5bd7-6eb8-476e-8134-09600a9e28a1` |
| 6 | `POST /v1/auth/token` | 200 | 72 | `qa-0f84a715-1c86-489a-8c6c-2cda18cd427e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-25cd6a0e-2ade-4299-a0f7-8d48c0cf10b5` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-c7786643-658e-4a0c-8002-b762b2179d99` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1cd5d0b2-d945-494c-a986-9053e6ec8774` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-305aacdf-80c2-4ba1-95b2-07867d013de3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-834bd077-d860-4ceb-ae7e-10a36722767d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834bd077-d860-4ceb-ae7e-10a36722767d
Content-Type: application/json

--- request body ---
{"handle":"qa-a0ba35644704","displayName":"QA a0ba35644704","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-834bd077-d860-4ceb-ae7e-10a36722767d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-a0ba35644704
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d383691d-6f7c-49be-b363-439cfb511d55","handle":"qa-a0ba35644704","displayName":"QA a0ba35644704","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.022628569Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf8bb1e5-5728-465f-8b84-e6ac1362729d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf8bb1e5-5728-465f-8b84-e6ac1362729d
Content-Type: application/json

--- request body ---
{"handle":"qa-4cecf990146e","displayName":"QA 4cecf990146e","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf8bb1e5-5728-465f-8b84-e6ac1362729d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-4cecf990146e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29cff57c-3b76-4f0b-b4e3-8e9a3e5c8402","handle":"qa-4cecf990146e","displayName":"QA 4cecf990146e","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.079909257Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97cceb12-bbcb-4fa4-8efa-eaee5515d335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97cceb12-bbcb-4fa4-8efa-eaee5515d335
Content-Type: application/json

--- request body ---
{"handle":"qa-a0ba35644704","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-97cceb12-bbcb-4fa4-8efa-eaee5515d335
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d383691d-6f7c-49be-b363-439cfb511d55"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-564c2ffe-a44c-4d27-822b-e8ce9cc5a057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-564c2ffe-a44c-4d27-822b-e8ce9cc5a057
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4cecf990146e","subject":"Error contract","message":"Hi"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-564c2ffe-a44c-4d27-822b-e8ce9cc5a057
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
Location: /v1/conversations/cnv_99ae2cce-62bd-43b8-9880-142e781e28ca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_99ae2cce-62bd-43b8-9880-142e781e28ca","subject":"Error contract","status":"open","region":"eu","participants":["qa-a0ba35644704","qa-4cecf990146e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.226318034Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-8a7d5bd7-6eb8-476e-8134-09600a9e28a1

--- request headers ---
Accept: application/json
X-Fault-Key: cfd49ff2-7afd-4f50-9ecf-6e8b60a76f44
X-Fault: unavailable-once
X-Correlation-Id: qa-8a7d5bd7-6eb8-476e-8134-09600a9e28a1
Content-Type: application/json

--- request body ---
{"handle":"qa-059050701aa7","displayName":"QA 059050701aa7","password":"****","region":"eu"}

--- response: 503 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a7d5bd7-6eb8-476e-8134-09600a9e28a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-8a7d5bd7-6eb8-476e-8134-09600a9e28a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f84a715-1c86-489a-8c6c-2cda18cd427e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f84a715-1c86-489a-8c6c-2cda18cd427e
Content-Type: application/json

--- request body ---
{"handle":"qa-4cecf990146e","password":"****"}

--- response: 200 in 72 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f84a715-1c86-489a-8c6c-2cda18cd427e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29cff57c-3b76-4f0b-b4e3-8e9a3e5c8402"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25cd6a0e-2ade-4299-a0f7-8d48c0cf10b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25cd6a0e-2ade-4299-a0f7-8d48c0cf10b5
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25cd6a0e-2ade-4299-a0f7-8d48c0cf10b5
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
correlation: qa-c7786643-658e-4a0c-8002-b762b2179d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7786643-658e-4a0c-8002-b762b2179d99
Content-Type: application/json

--- request body ---
{"handle":"qa-4cecf990146e","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7786643-658e-4a0c-8002-b762b2179d99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7786643-658e-4a0c-8002-b762b2179d99"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cd5d0b2-d945-494c-a986-9053e6ec8774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd5d0b2-d945-494c-a986-9053e6ec8774
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cd5d0b2-d945-494c-a986-9053e6ec8774
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
correlation: qa-305aacdf-80c2-4ba1-95b2-07867d013de3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-305aacdf-80c2-4ba1-95b2-07867d013de3
Content-Type: application/json

--- request body ---
{"handle":"qa-a0ba35644704","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-305aacdf-80c2-4ba1-95b2-07867d013de3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-305aacdf-80c2-4ba1-95b2-07867d013de3"}
```
