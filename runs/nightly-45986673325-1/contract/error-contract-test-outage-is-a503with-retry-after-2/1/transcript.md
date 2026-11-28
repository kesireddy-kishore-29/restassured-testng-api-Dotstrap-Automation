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
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-a5729976-aff7-48b3-ab7c-b133ef8598d3` |
| 2 | `POST /v1/accounts` | 201 | 103 | `qa-ab00652d-e608-4fc6-8b06-da42961225a3` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-a3396409-a493-425f-aefd-412634d70100` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-150faef4-79d0-4354-90b2-ffd1e80bc9e8` |
| 5 | `GET /v1/accounts/me` | 503 | 9 | `qa-12f03ceb-e42d-4e57-a3c5-059a9aec3089` |
| 6 | `POST /v1/auth/token` | 200 | 71 | `qa-b9790e3a-6f5f-4d3c-adb2-f70c45ec618d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-dad8899a-d276-426b-9307-99634c7967ef` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-4ae44e8b-1a51-401c-9f77-d15f73227cdd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-e96e2d15-e222-4fc8-84ed-41f9119bd576` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-a002c470-ec59-4c6c-b99a-cf4741cf335a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a5729976-aff7-48b3-ab7c-b133ef8598d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5729976-aff7-48b3-ab7c-b133ef8598d3
Content-Type: application/json

--- request body ---
{"handle":"qa-86cfb2841edc","displayName":"QA 86cfb2841edc","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5729976-aff7-48b3-ab7c-b133ef8598d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-86cfb2841edc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fce2d763-d12a-461d-971f-e983c5a0fc4b","handle":"qa-86cfb2841edc","displayName":"QA 86cfb2841edc","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.043643561Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ab00652d-e608-4fc6-8b06-da42961225a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab00652d-e608-4fc6-8b06-da42961225a3
Content-Type: application/json

--- request body ---
{"handle":"qa-a9e802a428a0","displayName":"QA a9e802a428a0","password":"****","region":"eu"}

--- response: 201 in 103 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab00652d-e608-4fc6-8b06-da42961225a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-a9e802a428a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f06297b7-2ba3-4645-b5dd-f16dd4e2505e","handle":"qa-a9e802a428a0","displayName":"QA a9e802a428a0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.157715238Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a3396409-a493-425f-aefd-412634d70100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3396409-a493-425f-aefd-412634d70100
Content-Type: application/json

--- request body ---
{"handle":"qa-86cfb2841edc","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3396409-a493-425f-aefd-412634d70100
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fce2d763-d12a-461d-971f-e983c5a0fc4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-150faef4-79d0-4354-90b2-ffd1e80bc9e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150faef4-79d0-4354-90b2-ffd1e80bc9e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9e802a428a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-150faef4-79d0-4354-90b2-ffd1e80bc9e8
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
Location: /v1/conversations/cnv_834f9e13-9189-4866-bf26-4afecdf243fc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_834f9e13-9189-4866-bf26-4afecdf243fc","subject":"Error contract","status":"open","region":"eu","participants":["qa-86cfb2841edc","qa-a9e802a428a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.262029248Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-12f03ceb-e42d-4e57-a3c5-059a9aec3089

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f0e412d4-e953-49fe-ae05-058e8b66a91b
X-Correlation-Id: qa-12f03ceb-e42d-4e57-a3c5-059a9aec3089
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12f03ceb-e42d-4e57-a3c5-059a9aec3089
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-12f03ceb-e42d-4e57-a3c5-059a9aec3089"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9790e3a-6f5f-4d3c-adb2-f70c45ec618d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9790e3a-6f5f-4d3c-adb2-f70c45ec618d
Content-Type: application/json

--- request body ---
{"handle":"qa-a9e802a428a0","password":"****"}

--- response: 200 in 71 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9790e3a-6f5f-4d3c-adb2-f70c45ec618d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f06297b7-2ba3-4645-b5dd-f16dd4e2505e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dad8899a-d276-426b-9307-99634c7967ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad8899a-d276-426b-9307-99634c7967ef
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dad8899a-d276-426b-9307-99634c7967ef
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
correlation: qa-4ae44e8b-1a51-401c-9f77-d15f73227cdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae44e8b-1a51-401c-9f77-d15f73227cdd
Content-Type: application/json

--- request body ---
{"handle":"qa-a9e802a428a0","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ae44e8b-1a51-401c-9f77-d15f73227cdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ae44e8b-1a51-401c-9f77-d15f73227cdd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e96e2d15-e222-4fc8-84ed-41f9119bd576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e96e2d15-e222-4fc8-84ed-41f9119bd576
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e96e2d15-e222-4fc8-84ed-41f9119bd576
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
correlation: qa-a002c470-ec59-4c6c-b99a-cf4741cf335a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a002c470-ec59-4c6c-b99a-cf4741cf335a
Content-Type: application/json

--- request body ---
{"handle":"qa-86cfb2841edc","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a002c470-ec59-4c6c-b99a-cf4741cf335a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a002c470-ec59-4c6c-b99a-cf4741cf335a"}
```
