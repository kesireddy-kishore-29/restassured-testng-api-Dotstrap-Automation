# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-da88e558-19f1-45ca-9875-41be3ba5cc83` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-85cd8cb6-dbda-4853-be18-645e08725e7d` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-573feaa0-007f-4bcd-9e61-d7d4228a5097` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-991b0532-9e26-436e-95ea-6bcb86eea89e` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-d940131e-2d87-4e98-9ca2-85944d6df968` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-98bfd416-d1cd-4d31-a2c3-d7664c21c1ca` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ce007bf3-67e4-4daf-be6e-1f4eee60dca2` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-f8079ebf-4725-410f-844e-e496de0f7d2a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1918ad7a-e745-46c3-9a8d-ad078ed1fd6e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-f31292f2-d5ba-40ad-9958-7ade96a887c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da88e558-19f1-45ca-9875-41be3ba5cc83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da88e558-19f1-45ca-9875-41be3ba5cc83
Content-Type: application/json

--- request body ---
{"handle":"qa-209079334ab1","displayName":"QA 209079334ab1","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-da88e558-19f1-45ca-9875-41be3ba5cc83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Location: /v1/accounts/qa-209079334ab1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_98d42ffb-8232-4414-b6a4-14d1cd7affce","handle":"qa-209079334ab1","displayName":"QA 209079334ab1","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.018579448Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-85cd8cb6-dbda-4853-be18-645e08725e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85cd8cb6-dbda-4853-be18-645e08725e7d
Content-Type: application/json

--- request body ---
{"handle":"qa-faefbead750c","displayName":"QA faefbead750c","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-85cd8cb6-dbda-4853-be18-645e08725e7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Location: /v1/accounts/qa-faefbead750c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16ed26f5-85ba-4aae-b784-bab1354b7765","handle":"qa-faefbead750c","displayName":"QA faefbead750c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.068355665Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-573feaa0-007f-4bcd-9e61-d7d4228a5097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573feaa0-007f-4bcd-9e61-d7d4228a5097
Content-Type: application/json

--- request body ---
{"handle":"qa-209079334ab1","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-573feaa0-007f-4bcd-9e61-d7d4228a5097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98d42ffb-8232-4414-b6a4-14d1cd7affce"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-991b0532-9e26-436e-95ea-6bcb86eea89e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-991b0532-9e26-436e-95ea-6bcb86eea89e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-faefbead750c","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-991b0532-9e26-436e-95ea-6bcb86eea89e
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
Location: /v1/conversations/cnv_fc1bb360-c8a6-42d3-8108-8202777230a1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc1bb360-c8a6-42d3-8108-8202777230a1","subject":"Error contract","status":"open","region":"eu","participants":["qa-209079334ab1","qa-faefbead750c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.155331309Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d940131e-2d87-4e98-9ca2-85944d6df968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d940131e-2d87-4e98-9ca2-85944d6df968
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d940131e-2d87-4e98-9ca2-85944d6df968
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-d940131e-2d87-4e98-9ca2-85944d6df968"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98bfd416-d1cd-4d31-a2c3-d7664c21c1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98bfd416-d1cd-4d31-a2c3-d7664c21c1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-faefbead750c","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-98bfd416-d1cd-4d31-a2c3-d7664c21c1ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16ed26f5-85ba-4aae-b784-bab1354b7765"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce007bf3-67e4-4daf-be6e-1f4eee60dca2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce007bf3-67e4-4daf-be6e-1f4eee60dca2
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce007bf3-67e4-4daf-be6e-1f4eee60dca2
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
correlation: qa-f8079ebf-4725-410f-844e-e496de0f7d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8079ebf-4725-410f-844e-e496de0f7d2a
Content-Type: application/json

--- request body ---
{"handle":"qa-faefbead750c","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8079ebf-4725-410f-844e-e496de0f7d2a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8079ebf-4725-410f-844e-e496de0f7d2a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1918ad7a-e745-46c3-9a8d-ad078ed1fd6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1918ad7a-e745-46c3-9a8d-ad078ed1fd6e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1918ad7a-e745-46c3-9a8d-ad078ed1fd6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f31292f2-d5ba-40ad-9958-7ade96a887c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f31292f2-d5ba-40ad-9958-7ade96a887c9
Content-Type: application/json

--- request body ---
{"handle":"qa-209079334ab1","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f31292f2-d5ba-40ad-9958-7ade96a887c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f31292f2-d5ba-40ad-9958-7ade96a887c9"}
```
