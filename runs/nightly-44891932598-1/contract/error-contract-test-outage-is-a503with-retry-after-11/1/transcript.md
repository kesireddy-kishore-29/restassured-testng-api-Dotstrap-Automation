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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-20cad45a-6d6e-4cc8-bf50-428318d8dfb4` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-926b5189-fc41-4125-bfb4-4da826f1a40e` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-54c71f5f-0cf3-4ce2-b2a9-06b6eb3dbb60` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-cfed1048-5ce8-4ddf-9bf6-e6a84a368335` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 14 | `qa-2773470b-b477-432b-8708-1e74391df35b` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-116a53cc-6aca-4648-8b27-7b8d4ad3f855` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-29b0e123-8b1d-4f8b-96c8-dfaab29dfc6d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-87793f21-94e7-46cd-a4d9-23cbd89eb9dd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-31dcc842-32f1-4c56-bde8-05b6993b9e98` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-e5707478-2314-44f6-a1e9-7f19abf40e25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-20cad45a-6d6e-4cc8-bf50-428318d8dfb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20cad45a-6d6e-4cc8-bf50-428318d8dfb4
Content-Type: application/json

--- request body ---
{"handle":"qa-f02555484f1b","displayName":"QA f02555484f1b","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-20cad45a-6d6e-4cc8-bf50-428318d8dfb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Location: /v1/accounts/qa-f02555484f1b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4642092-e288-4e09-9a02-e3ae3568c9f7","handle":"qa-f02555484f1b","displayName":"QA f02555484f1b","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.503050551Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-926b5189-fc41-4125-bfb4-4da826f1a40e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-926b5189-fc41-4125-bfb4-4da826f1a40e
Content-Type: application/json

--- request body ---
{"handle":"qa-a8d55f511b88","displayName":"QA a8d55f511b88","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-926b5189-fc41-4125-bfb4-4da826f1a40e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-a8d55f511b88
X-Served-Region: eu
Content-Length: 181

{"id":"acc_192626f1-1a8f-4106-8d1a-b5c888c545f5","handle":"qa-a8d55f511b88","displayName":"QA a8d55f511b88","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.555666599Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-54c71f5f-0cf3-4ce2-b2a9-06b6eb3dbb60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c71f5f-0cf3-4ce2-b2a9-06b6eb3dbb60
Content-Type: application/json

--- request body ---
{"handle":"qa-f02555484f1b","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-54c71f5f-0cf3-4ce2-b2a9-06b6eb3dbb60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4642092-e288-4e09-9a02-e3ae3568c9f7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cfed1048-5ce8-4ddf-9bf6-e6a84a368335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfed1048-5ce8-4ddf-9bf6-e6a84a368335
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8d55f511b88","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfed1048-5ce8-4ddf-9bf6-e6a84a368335
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
Location: /v1/conversations/cnv_cfd17ecb-0d3f-484b-b6f7-367aaca5efeb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfd17ecb-0d3f-484b-b6f7-367aaca5efeb","subject":"Error contract","status":"open","region":"eu","participants":["qa-f02555484f1b","qa-a8d55f511b88"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.623637424Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cfd17ecb-0d3f-484b-b6f7-367aaca5efeb/read
correlation: qa-2773470b-b477-432b-8708-1e74391df35b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fa9884aa-0244-4ff5-a74c-ece954c5e134
X-Correlation-Id: qa-2773470b-b477-432b-8708-1e74391df35b
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2773470b-b477-432b-8708-1e74391df35b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_cfd17ecb-0d3f-484b-b6f7-367aaca5efeb/read","correlationId":"qa-2773470b-b477-432b-8708-1e74391df35b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-116a53cc-6aca-4648-8b27-7b8d4ad3f855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-116a53cc-6aca-4648-8b27-7b8d4ad3f855
Content-Type: application/json

--- request body ---
{"handle":"qa-a8d55f511b88","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-116a53cc-6aca-4648-8b27-7b8d4ad3f855
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_192626f1-1a8f-4106-8d1a-b5c888c545f5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29b0e123-8b1d-4f8b-96c8-dfaab29dfc6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29b0e123-8b1d-4f8b-96c8-dfaab29dfc6d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29b0e123-8b1d-4f8b-96c8-dfaab29dfc6d
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
correlation: qa-87793f21-94e7-46cd-a4d9-23cbd89eb9dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87793f21-94e7-46cd-a4d9-23cbd89eb9dd
Content-Type: application/json

--- request body ---
{"handle":"qa-a8d55f511b88","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87793f21-94e7-46cd-a4d9-23cbd89eb9dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87793f21-94e7-46cd-a4d9-23cbd89eb9dd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31dcc842-32f1-4c56-bde8-05b6993b9e98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31dcc842-32f1-4c56-bde8-05b6993b9e98
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31dcc842-32f1-4c56-bde8-05b6993b9e98
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
correlation: qa-e5707478-2314-44f6-a1e9-7f19abf40e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5707478-2314-44f6-a1e9-7f19abf40e25
Content-Type: application/json

--- request body ---
{"handle":"qa-f02555484f1b","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5707478-2314-44f6-a1e9-7f19abf40e25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5707478-2314-44f6-a1e9-7f19abf40e25"}
```
