# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-3e0a94a1-ca93-4062-8aab-990a2dcbc4e0` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-28f99b14-f4ba-4b20-b247-5c70aac22869` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-e91769d6-93cd-4f35-9151-29fbe86e2b74` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f1f8366f-e8d5-4fb0-a408-983634f8e958` |
| 5 | `POST /v1/conversations` | 422 | 7 | `qa-8da0a84f-ffda-4d3b-ac89-750886e12c43` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-dfa05a66-87b5-448b-b28e-423056049393` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-1d35c55d-3c88-4fd6-8c33-5659167693f4` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-b4068b00-3b1a-462e-9b12-d8f7d8f7320d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-01248059-6ed6-4135-b39a-7b96346e5d89` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-d943db29-1924-4aa1-90d7-66a79bcd507f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3e0a94a1-ca93-4062-8aab-990a2dcbc4e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e0a94a1-ca93-4062-8aab-990a2dcbc4e0
Content-Type: application/json

--- request body ---
{"handle":"qa-26ef9fa96266","displayName":"QA 26ef9fa96266","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e0a94a1-ca93-4062-8aab-990a2dcbc4e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-26ef9fa96266
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f574c566-7bd7-40c4-94b4-aea0492c1e73","handle":"qa-26ef9fa96266","displayName":"QA 26ef9fa96266","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.962160828Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-28f99b14-f4ba-4b20-b247-5c70aac22869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28f99b14-f4ba-4b20-b247-5c70aac22869
Content-Type: application/json

--- request body ---
{"handle":"qa-a7d1321ae532","displayName":"QA a7d1321ae532","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-28f99b14-f4ba-4b20-b247-5c70aac22869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-a7d1321ae532
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cceabc9a-3f72-4fd3-a610-a5a447d8008e","handle":"qa-a7d1321ae532","displayName":"QA a7d1321ae532","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.995003833Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e91769d6-93cd-4f35-9151-29fbe86e2b74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e91769d6-93cd-4f35-9151-29fbe86e2b74
Content-Type: application/json

--- request body ---
{"handle":"qa-26ef9fa96266","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e91769d6-93cd-4f35-9151-29fbe86e2b74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f574c566-7bd7-40c4-94b4-aea0492c1e73"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f1f8366f-e8d5-4fb0-a408-983634f8e958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f8366f-e8d5-4fb0-a408-983634f8e958
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7d1321ae532","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1f8366f-e8d5-4fb0-a408-983634f8e958
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
Location: /v1/conversations/cnv_39facb4f-2555-4c0d-b016-563c04cba175
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_39facb4f-2555-4c0d-b016-563c04cba175","subject":"Error contract","status":"open","region":"eu","participants":["qa-26ef9fa96266","qa-a7d1321ae532"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.051348490Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8da0a84f-ffda-4d3b-ac89-750886e12c43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da0a84f-ffda-4d3b-ac89-750886e12c43
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7d1321ae532","subject":" ","message":"Hi"}

--- response: 422 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8da0a84f-ffda-4d3b-ac89-750886e12c43
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-8da0a84f-ffda-4d3b-ac89-750886e12c43","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dfa05a66-87b5-448b-b28e-423056049393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfa05a66-87b5-448b-b28e-423056049393
Content-Type: application/json

--- request body ---
{"handle":"qa-a7d1321ae532","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfa05a66-87b5-448b-b28e-423056049393
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cceabc9a-3f72-4fd3-a610-a5a447d8008e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d35c55d-3c88-4fd6-8c33-5659167693f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d35c55d-3c88-4fd6-8c33-5659167693f4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d35c55d-3c88-4fd6-8c33-5659167693f4
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
correlation: qa-b4068b00-3b1a-462e-9b12-d8f7d8f7320d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4068b00-3b1a-462e-9b12-d8f7d8f7320d
Content-Type: application/json

--- request body ---
{"handle":"qa-a7d1321ae532","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4068b00-3b1a-462e-9b12-d8f7d8f7320d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4068b00-3b1a-462e-9b12-d8f7d8f7320d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01248059-6ed6-4135-b39a-7b96346e5d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01248059-6ed6-4135-b39a-7b96346e5d89
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01248059-6ed6-4135-b39a-7b96346e5d89
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
correlation: qa-d943db29-1924-4aa1-90d7-66a79bcd507f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d943db29-1924-4aa1-90d7-66a79bcd507f
Content-Type: application/json

--- request body ---
{"handle":"qa-26ef9fa96266","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d943db29-1924-4aa1-90d7-66a79bcd507f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d943db29-1924-4aa1-90d7-66a79bcd507f"}
```
