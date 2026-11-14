# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-6b8abe31-b628-4f1e-93bf-0d049953d3fe` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-18968de1-b86f-40f2-a6c3-4064af197740` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-3a1bdbae-0589-4ea0-ae16-eafbb19a0f0b` |
| 4 | `POST /v1/conversations` | 201 | 55 | `qa-35cf922d-4aa6-4cb6-8e23-05e54fe29280` |
| 5 | `GET /v1/credits/ledger` | 503 | 12 | `qa-b3015554-53c8-41ae-80c4-353a1ca1d93f` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-0a46b382-e28d-40bb-abe8-9fc83e772de1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-97eb312c-0d43-4c5e-91c9-685d2aabf6fb` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-621de400-2d13-4f0c-bcf7-9664ed3af5b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-4893302f-b30e-4c6c-b020-739c8062f80e` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-04cdf6a3-222f-41d5-ae69-52d464f48915` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b8abe31-b628-4f1e-93bf-0d049953d3fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8abe31-b628-4f1e-93bf-0d049953d3fe
Content-Type: application/json

--- request body ---
{"handle":"qa-a730440e29b9","displayName":"QA a730440e29b9","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8abe31-b628-4f1e-93bf-0d049953d3fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-a730440e29b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_621256d5-00c1-4c23-93fb-2585052e37ea","handle":"qa-a730440e29b9","displayName":"QA a730440e29b9","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.243694662Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-18968de1-b86f-40f2-a6c3-4064af197740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18968de1-b86f-40f2-a6c3-4064af197740
Content-Type: application/json

--- request body ---
{"handle":"qa-15f30640b85a","displayName":"QA 15f30640b85a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-18968de1-b86f-40f2-a6c3-4064af197740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-15f30640b85a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7add5ebd-f7a7-4042-89b6-8f038ca7f23c","handle":"qa-15f30640b85a","displayName":"QA 15f30640b85a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.273670074Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a1bdbae-0589-4ea0-ae16-eafbb19a0f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a1bdbae-0589-4ea0-ae16-eafbb19a0f0b
Content-Type: application/json

--- request body ---
{"handle":"qa-a730440e29b9","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a1bdbae-0589-4ea0-ae16-eafbb19a0f0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_621256d5-00c1-4c23-93fb-2585052e37ea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35cf922d-4aa6-4cb6-8e23-05e54fe29280

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35cf922d-4aa6-4cb6-8e23-05e54fe29280
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15f30640b85a","subject":"Error contract","message":"Hi"}

--- response: 201 in 55 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-35cf922d-4aa6-4cb6-8e23-05e54fe29280
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
Location: /v1/conversations/cnv_4c5f0811-4ccb-4d64-ae64-8d79172b6b84
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c5f0811-4ccb-4d64-ae64-8d79172b6b84","subject":"Error contract","status":"open","region":"eu","participants":["qa-a730440e29b9","qa-15f30640b85a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.344408723Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b3015554-53c8-41ae-80c4-353a1ca1d93f

--- request headers ---
Accept: application/json
X-Fault-Key: ba5809fc-3915-432c-a934-f2f9105b9458
X-Fault: unavailable-once
X-Correlation-Id: qa-b3015554-53c8-41ae-80c4-353a1ca1d93f
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3015554-53c8-41ae-80c4-353a1ca1d93f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-b3015554-53c8-41ae-80c4-353a1ca1d93f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a46b382-e28d-40bb-abe8-9fc83e772de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a46b382-e28d-40bb-abe8-9fc83e772de1
Content-Type: application/json

--- request body ---
{"handle":"qa-15f30640b85a","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a46b382-e28d-40bb-abe8-9fc83e772de1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7add5ebd-f7a7-4042-89b6-8f038ca7f23c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97eb312c-0d43-4c5e-91c9-685d2aabf6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97eb312c-0d43-4c5e-91c9-685d2aabf6fb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97eb312c-0d43-4c5e-91c9-685d2aabf6fb
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
correlation: qa-621de400-2d13-4f0c-bcf7-9664ed3af5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-621de400-2d13-4f0c-bcf7-9664ed3af5b9
Content-Type: application/json

--- request body ---
{"handle":"qa-15f30640b85a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-621de400-2d13-4f0c-bcf7-9664ed3af5b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-621de400-2d13-4f0c-bcf7-9664ed3af5b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4893302f-b30e-4c6c-b020-739c8062f80e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4893302f-b30e-4c6c-b020-739c8062f80e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4893302f-b30e-4c6c-b020-739c8062f80e
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
correlation: qa-04cdf6a3-222f-41d5-ae69-52d464f48915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04cdf6a3-222f-41d5-ae69-52d464f48915
Content-Type: application/json

--- request body ---
{"handle":"qa-a730440e29b9","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04cdf6a3-222f-41d5-ae69-52d464f48915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04cdf6a3-222f-41d5-ae69-52d464f48915"}
```
