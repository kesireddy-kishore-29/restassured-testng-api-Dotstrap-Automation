# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-42fcba3d-40a4-4d1e-9415-b1c2b04f5400` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-6b3d600c-a81e-4cad-9c41-d370c4e2f01d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-cc02674b-1019-4349-9d36-7d286f574f1f` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-39406ef7-cf99-482b-8dac-96b0c9950e28` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 15 | `qa-1c2a6628-edfc-4974-90b6-e2dec1adc1f1` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-e0b7ebe6-c102-49ad-b2c3-ad19445badd0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8d3523b1-6760-47b7-a948-671ebf23b338` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-aaae36ec-7684-4ce0-a338-1b2241e559ed` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-8f1a2276-4a75-4fef-ae31-0ec8882a734c` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-e3a55fd0-aec1-42ae-b218-c8a723bc0ea1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-42fcba3d-40a4-4d1e-9415-b1c2b04f5400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42fcba3d-40a4-4d1e-9415-b1c2b04f5400
Content-Type: application/json

--- request body ---
{"handle":"qa-afd1735dc7b2","displayName":"QA afd1735dc7b2","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-42fcba3d-40a4-4d1e-9415-b1c2b04f5400
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-afd1735dc7b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90129c59-ac20-406e-9b65-d89074fe223b","handle":"qa-afd1735dc7b2","displayName":"QA afd1735dc7b2","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.660722103Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b3d600c-a81e-4cad-9c41-d370c4e2f01d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b3d600c-a81e-4cad-9c41-d370c4e2f01d
Content-Type: application/json

--- request body ---
{"handle":"qa-a2dfe7421f8d","displayName":"QA a2dfe7421f8d","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b3d600c-a81e-4cad-9c41-d370c4e2f01d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Location: /v1/accounts/qa-a2dfe7421f8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5dac353b-07ca-45f2-a522-181724b05e9b","handle":"qa-a2dfe7421f8d","displayName":"QA a2dfe7421f8d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.687185521Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cc02674b-1019-4349-9d36-7d286f574f1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc02674b-1019-4349-9d36-7d286f574f1f
Content-Type: application/json

--- request body ---
{"handle":"qa-afd1735dc7b2","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc02674b-1019-4349-9d36-7d286f574f1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90129c59-ac20-406e-9b65-d89074fe223b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-39406ef7-cf99-482b-8dac-96b0c9950e28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39406ef7-cf99-482b-8dac-96b0c9950e28
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a2dfe7421f8d","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-39406ef7-cf99-482b-8dac-96b0c9950e28
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
Location: /v1/conversations/cnv_5a84510c-5e83-4d53-8df0-cdc432504307
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a84510c-5e83-4d53-8df0-cdc432504307","subject":"Error contract","status":"open","region":"eu","participants":["qa-afd1735dc7b2","qa-a2dfe7421f8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.767076948Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5a84510c-5e83-4d53-8df0-cdc432504307/messages
correlation: qa-1c2a6628-edfc-4974-90b6-e2dec1adc1f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c2a6628-edfc-4974-90b6-e2dec1adc1f1
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c2a6628-edfc-4974-90b6-e2dec1adc1f1
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_5a84510c-5e83-4d53-8df0-cdc432504307/messages","correlationId":"qa-1c2a6628-edfc-4974-90b6-e2dec1adc1f1","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0b7ebe6-c102-49ad-b2c3-ad19445badd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0b7ebe6-c102-49ad-b2c3-ad19445badd0
Content-Type: application/json

--- request body ---
{"handle":"qa-a2dfe7421f8d","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b7ebe6-c102-49ad-b2c3-ad19445badd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5dac353b-07ca-45f2-a522-181724b05e9b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d3523b1-6760-47b7-a948-671ebf23b338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d3523b1-6760-47b7-a948-671ebf23b338
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d3523b1-6760-47b7-a948-671ebf23b338
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
correlation: qa-aaae36ec-7684-4ce0-a338-1b2241e559ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaae36ec-7684-4ce0-a338-1b2241e559ed
Content-Type: application/json

--- request body ---
{"handle":"qa-a2dfe7421f8d","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aaae36ec-7684-4ce0-a338-1b2241e559ed
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aaae36ec-7684-4ce0-a338-1b2241e559ed"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f1a2276-4a75-4fef-ae31-0ec8882a734c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f1a2276-4a75-4fef-ae31-0ec8882a734c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f1a2276-4a75-4fef-ae31-0ec8882a734c
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
correlation: qa-e3a55fd0-aec1-42ae-b218-c8a723bc0ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3a55fd0-aec1-42ae-b218-c8a723bc0ea1
Content-Type: application/json

--- request body ---
{"handle":"qa-afd1735dc7b2","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3a55fd0-aec1-42ae-b218-c8a723bc0ea1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3a55fd0-aec1-42ae-b218-c8a723bc0ea1"}
```
