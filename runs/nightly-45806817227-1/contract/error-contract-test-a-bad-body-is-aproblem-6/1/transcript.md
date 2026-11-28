# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-460c8bdd-0373-4c98-8409-baa8d11d9f6d` |
| 2 | `POST /v1/accounts` | 201 | 101 | `qa-99db752c-c7c8-434e-ad7e-c49dc1f3cec2` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-520bed36-81b3-4605-aa78-9722bfb69dae` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-0e6d80b4-0485-4bc5-9a15-2b485e41aa15` |
| 5 | `PATCH /v1/accounts/me` | 400 | 20 | `qa-c5b05338-025b-4a3c-af1f-c9e93c10d5f5` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-2b7adc6d-985c-4866-93d8-21e084f9b6e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-555eca46-d9c7-4ddd-8927-910a4cf597cf` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-d58c42f0-ae19-40f6-83e2-9ff8d220d83d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-fcbc3416-b526-4334-9b94-6eecd10c77cb` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-81089dd1-9497-420e-8d06-11c09fa83e0d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-460c8bdd-0373-4c98-8409-baa8d11d9f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-460c8bdd-0373-4c98-8409-baa8d11d9f6d
Content-Type: application/json

--- request body ---
{"handle":"qa-bfd775870665","displayName":"QA bfd775870665","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-460c8bdd-0373-4c98-8409-baa8d11d9f6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-bfd775870665
X-Served-Region: eu
Content-Length: 181

{"id":"acc_33fbccb1-f273-41a4-8705-bb96b7a80667","handle":"qa-bfd775870665","displayName":"QA bfd775870665","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.221143307Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-99db752c-c7c8-434e-ad7e-c49dc1f3cec2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99db752c-c7c8-434e-ad7e-c49dc1f3cec2
Content-Type: application/json

--- request body ---
{"handle":"qa-8e6452258878","displayName":"QA 8e6452258878","password":"****","region":"eu"}

--- response: 201 in 101 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-99db752c-c7c8-434e-ad7e-c49dc1f3cec2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-8e6452258878
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5577840f-becb-4f50-97e9-0c3757030e3d","handle":"qa-8e6452258878","displayName":"QA 8e6452258878","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.327754828Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-520bed36-81b3-4605-aa78-9722bfb69dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-520bed36-81b3-4605-aa78-9722bfb69dae
Content-Type: application/json

--- request body ---
{"handle":"qa-bfd775870665","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-520bed36-81b3-4605-aa78-9722bfb69dae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33fbccb1-f273-41a4-8705-bb96b7a80667"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e6d80b4-0485-4bc5-9a15-2b485e41aa15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6d80b4-0485-4bc5-9a15-2b485e41aa15
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e6452258878","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e6d80b4-0485-4bc5-9a15-2b485e41aa15
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
Location: /v1/conversations/cnv_fa12cb56-80c9-4fba-800a-e08a7c93822c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fa12cb56-80c9-4fba-800a-e08a7c93822c","subject":"Error contract","status":"open","region":"eu","participants":["qa-bfd775870665","qa-8e6452258878"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.440428510Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c5b05338-025b-4a3c-af1f-c9e93c10d5f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b05338-025b-4a3c-af1f-c9e93c10d5f5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5b05338-025b-4a3c-af1f-c9e93c10d5f5
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-c5b05338-025b-4a3c-af1f-c9e93c10d5f5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2b7adc6d-985c-4866-93d8-21e084f9b6e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b7adc6d-985c-4866-93d8-21e084f9b6e3
Content-Type: application/json

--- request body ---
{"handle":"qa-8e6452258878","password":"****"}

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b7adc6d-985c-4866-93d8-21e084f9b6e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5577840f-becb-4f50-97e9-0c3757030e3d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-555eca46-d9c7-4ddd-8927-910a4cf597cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555eca46-d9c7-4ddd-8927-910a4cf597cf
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-555eca46-d9c7-4ddd-8927-910a4cf597cf
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
correlation: qa-d58c42f0-ae19-40f6-83e2-9ff8d220d83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d58c42f0-ae19-40f6-83e2-9ff8d220d83d
Content-Type: application/json

--- request body ---
{"handle":"qa-8e6452258878","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d58c42f0-ae19-40f6-83e2-9ff8d220d83d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d58c42f0-ae19-40f6-83e2-9ff8d220d83d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcbc3416-b526-4334-9b94-6eecd10c77cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcbc3416-b526-4334-9b94-6eecd10c77cb
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcbc3416-b526-4334-9b94-6eecd10c77cb
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
correlation: qa-81089dd1-9497-420e-8d06-11c09fa83e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81089dd1-9497-420e-8d06-11c09fa83e0d
Content-Type: application/json

--- request body ---
{"handle":"qa-bfd775870665","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81089dd1-9497-420e-8d06-11c09fa83e0d
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81089dd1-9497-420e-8d06-11c09fa83e0d"}
```
