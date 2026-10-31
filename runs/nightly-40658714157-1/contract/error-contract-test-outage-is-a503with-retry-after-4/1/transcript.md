# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-1003546e-9122-4754-9b29-8078f4aea8fa` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-3b9d6da1-a5e8-4d81-b321-434e9d0c2934` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-e9061433-7dd9-4561-ace9-64d0f121943a` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-7e54b8e8-797d-4862-8158-69401232ea7d` |
| 5 | `DELETE /v1/accounts/me` | 503 | 19 | `qa-3a7c6fcb-fa59-495a-bc5b-fc35c5c27144` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-a4d5d2d9-5013-40a3-8c7a-29f9f4f30c60` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-af19a857-94b0-419a-9783-149fc376ec99` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-f00b5a24-420e-461e-b53a-1ae426aa00c9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-43d8caea-f654-4c7d-843b-f7d577620e4d` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-8e70dce1-95de-4c29-9f4e-279cf28d01a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1003546e-9122-4754-9b29-8078f4aea8fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1003546e-9122-4754-9b29-8078f4aea8fa
Content-Type: application/json

--- request body ---
{"handle":"qa-3b22f053fe0d","displayName":"QA 3b22f053fe0d","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1003546e-9122-4754-9b29-8078f4aea8fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Location: /v1/accounts/qa-3b22f053fe0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd7dd0a9-fa73-4530-8a6a-3eb6f28374c3","handle":"qa-3b22f053fe0d","displayName":"QA 3b22f053fe0d","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.283529585Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3b9d6da1-a5e8-4d81-b321-434e9d0c2934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b9d6da1-a5e8-4d81-b321-434e9d0c2934
Content-Type: application/json

--- request body ---
{"handle":"qa-902d235ea482","displayName":"QA 902d235ea482","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b9d6da1-a5e8-4d81-b321-434e9d0c2934
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Location: /v1/accounts/qa-902d235ea482
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1f0f923-624b-4682-bdd7-01b94a6294d1","handle":"qa-902d235ea482","displayName":"QA 902d235ea482","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.333084785Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e9061433-7dd9-4561-ace9-64d0f121943a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9061433-7dd9-4561-ace9-64d0f121943a
Content-Type: application/json

--- request body ---
{"handle":"qa-3b22f053fe0d","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9061433-7dd9-4561-ace9-64d0f121943a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd7dd0a9-fa73-4530-8a6a-3eb6f28374c3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7e54b8e8-797d-4862-8158-69401232ea7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e54b8e8-797d-4862-8158-69401232ea7d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-902d235ea482","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e54b8e8-797d-4862-8158-69401232ea7d
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
Location: /v1/conversations/cnv_236ff78f-da41-4c0f-bbc5-3a94bd073b20
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_236ff78f-da41-4c0f-bbc5-3a94bd073b20","subject":"Error contract","status":"open","region":"eu","participants":["qa-3b22f053fe0d","qa-902d235ea482"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.403403269Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a7c6fcb-fa59-495a-bc5b-fc35c5c27144

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 790a4067-53b8-4860-8f7d-2f2039b5b74d
X-Correlation-Id: qa-3a7c6fcb-fa59-495a-bc5b-fc35c5c27144
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a7c6fcb-fa59-495a-bc5b-fc35c5c27144
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3a7c6fcb-fa59-495a-bc5b-fc35c5c27144"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a4d5d2d9-5013-40a3-8c7a-29f9f4f30c60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d5d2d9-5013-40a3-8c7a-29f9f4f30c60
Content-Type: application/json

--- request body ---
{"handle":"qa-902d235ea482","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4d5d2d9-5013-40a3-8c7a-29f9f4f30c60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1f0f923-624b-4682-bdd7-01b94a6294d1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af19a857-94b0-419a-9783-149fc376ec99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af19a857-94b0-419a-9783-149fc376ec99
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af19a857-94b0-419a-9783-149fc376ec99
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
correlation: qa-f00b5a24-420e-461e-b53a-1ae426aa00c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f00b5a24-420e-461e-b53a-1ae426aa00c9
Content-Type: application/json

--- request body ---
{"handle":"qa-902d235ea482","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f00b5a24-420e-461e-b53a-1ae426aa00c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f00b5a24-420e-461e-b53a-1ae426aa00c9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43d8caea-f654-4c7d-843b-f7d577620e4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d8caea-f654-4c7d-843b-f7d577620e4d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43d8caea-f654-4c7d-843b-f7d577620e4d
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
correlation: qa-8e70dce1-95de-4c29-9f4e-279cf28d01a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e70dce1-95de-4c29-9f4e-279cf28d01a1
Content-Type: application/json

--- request body ---
{"handle":"qa-3b22f053fe0d","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e70dce1-95de-4c29-9f4e-279cf28d01a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e70dce1-95de-4c29-9f4e-279cf28d01a1"}
```
