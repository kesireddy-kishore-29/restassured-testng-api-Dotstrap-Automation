# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-c56bf41e-6ead-44c7-a849-bf4970504174` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-39ca0f5d-7058-4d18-b4d9-c55848f007a4` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-325e0d36-37fb-4a2d-b630-71d1e4370b82` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-2a37c9e8-010c-42ba-982d-b03f29342a14` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 18 | `qa-32b7fb08-b194-4951-9775-fb0f9714346a` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-3c5e2f0c-5d12-4b1d-bd35-b34ee0db570a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-279b9e0a-317e-4eec-9605-53ddd0a8eb91` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-5b4e0d6c-a009-440b-895f-14e16987eec2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-020f40ea-0750-4ac1-be70-9df21deb11e6` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-2362ac08-41a0-4cf6-9a90-645216fb8563` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c56bf41e-6ead-44c7-a849-bf4970504174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c56bf41e-6ead-44c7-a849-bf4970504174
Content-Type: application/json

--- request body ---
{"handle":"qa-487fbaf7f911","displayName":"QA 487fbaf7f911","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c56bf41e-6ead-44c7-a849-bf4970504174
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
Location: /v1/accounts/qa-487fbaf7f911
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e910424-e27d-431e-85ae-ff73e5d2f7ca","handle":"qa-487fbaf7f911","displayName":"QA 487fbaf7f911","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.259918481Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39ca0f5d-7058-4d18-b4d9-c55848f007a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39ca0f5d-7058-4d18-b4d9-c55848f007a4
Content-Type: application/json

--- request body ---
{"handle":"qa-321e2e48f085","displayName":"QA 321e2e48f085","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-39ca0f5d-7058-4d18-b4d9-c55848f007a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Location: /v1/accounts/qa-321e2e48f085
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c599ca9-f470-4273-bf6a-6d6b44cd46be","handle":"qa-321e2e48f085","displayName":"QA 321e2e48f085","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.305281638Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-325e0d36-37fb-4a2d-b630-71d1e4370b82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325e0d36-37fb-4a2d-b630-71d1e4370b82
Content-Type: application/json

--- request body ---
{"handle":"qa-487fbaf7f911","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-325e0d36-37fb-4a2d-b630-71d1e4370b82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e910424-e27d-431e-85ae-ff73e5d2f7ca"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a37c9e8-010c-42ba-982d-b03f29342a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a37c9e8-010c-42ba-982d-b03f29342a14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-321e2e48f085","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a37c9e8-010c-42ba-982d-b03f29342a14
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
Location: /v1/conversations/cnv_c2b514d7-c0d6-4646-a6bb-537bb24130d5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c2b514d7-c0d6-4646-a6bb-537bb24130d5","subject":"Error contract","status":"open","region":"eu","participants":["qa-487fbaf7f911","qa-321e2e48f085"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.374007842Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c2b514d7-c0d6-4646-a6bb-537bb24130d5/messages
correlation: qa-32b7fb08-b194-4951-9775-fb0f9714346a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b7fb08-b194-4951-9775-fb0f9714346a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32b7fb08-b194-4951-9775-fb0f9714346a
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_c2b514d7-c0d6-4646-a6bb-537bb24130d5/messages","correlationId":"qa-32b7fb08-b194-4951-9775-fb0f9714346a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3c5e2f0c-5d12-4b1d-bd35-b34ee0db570a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c5e2f0c-5d12-4b1d-bd35-b34ee0db570a
Content-Type: application/json

--- request body ---
{"handle":"qa-321e2e48f085","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c5e2f0c-5d12-4b1d-bd35-b34ee0db570a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c599ca9-f470-4273-bf6a-6d6b44cd46be"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-279b9e0a-317e-4eec-9605-53ddd0a8eb91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-279b9e0a-317e-4eec-9605-53ddd0a8eb91
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-279b9e0a-317e-4eec-9605-53ddd0a8eb91
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
correlation: qa-5b4e0d6c-a009-440b-895f-14e16987eec2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4e0d6c-a009-440b-895f-14e16987eec2
Content-Type: application/json

--- request body ---
{"handle":"qa-321e2e48f085","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4e0d6c-a009-440b-895f-14e16987eec2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b4e0d6c-a009-440b-895f-14e16987eec2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-020f40ea-0750-4ac1-be70-9df21deb11e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-020f40ea-0750-4ac1-be70-9df21deb11e6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-020f40ea-0750-4ac1-be70-9df21deb11e6
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
correlation: qa-2362ac08-41a0-4cf6-9a90-645216fb8563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2362ac08-41a0-4cf6-9a90-645216fb8563
Content-Type: application/json

--- request body ---
{"handle":"qa-487fbaf7f911","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2362ac08-41a0-4cf6-9a90-645216fb8563
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2362ac08-41a0-4cf6-9a90-645216fb8563"}
```
