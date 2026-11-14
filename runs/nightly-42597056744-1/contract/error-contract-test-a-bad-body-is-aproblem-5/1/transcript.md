# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-6ba72b82-8149-478a-a51c-5a7d1416e18a` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-b89c202d-77aa-4614-b02d-cd400873817c` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-819407ff-be72-442f-931f-dc7461785fb7` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-c8cd1fa9-2430-462c-a3a3-cb8b5fdba51d` |
| 5 | `POST /v1/accounts` | 422 | 28 | `qa-348fb1ad-bf93-44b3-9571-12893d3c6de7` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-7c108455-fc3f-4eb4-95da-3d2e0562b797` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f13e129e-dbf8-4d77-b10e-388e6ab96183` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-b9d2268b-150c-4f18-bd49-05a41ab2c634` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8b4d8316-bfa2-4207-b6e1-22c44ab81bc5` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-5ea3a996-d2d1-4fe8-a358-3804b3373e9c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6ba72b82-8149-478a-a51c-5a7d1416e18a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba72b82-8149-478a-a51c-5a7d1416e18a
Content-Type: application/json

--- request body ---
{"handle":"qa-44b45b8b0999","displayName":"QA 44b45b8b0999","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba72b82-8149-478a-a51c-5a7d1416e18a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Location: /v1/accounts/qa-44b45b8b0999
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6adf81fb-f02a-4ea6-ade2-410e513132c1","handle":"qa-44b45b8b0999","displayName":"QA 44b45b8b0999","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.875739193Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b89c202d-77aa-4614-b02d-cd400873817c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b89c202d-77aa-4614-b02d-cd400873817c
Content-Type: application/json

--- request body ---
{"handle":"qa-bdef7b2f336c","displayName":"QA bdef7b2f336c","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b89c202d-77aa-4614-b02d-cd400873817c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
Location: /v1/accounts/qa-bdef7b2f336c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b758dec3-446e-46e2-9bb4-f51a955fd5f0","handle":"qa-bdef7b2f336c","displayName":"QA bdef7b2f336c","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.925609853Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-819407ff-be72-442f-931f-dc7461785fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-819407ff-be72-442f-931f-dc7461785fb7
Content-Type: application/json

--- request body ---
{"handle":"qa-44b45b8b0999","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-819407ff-be72-442f-931f-dc7461785fb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6adf81fb-f02a-4ea6-ade2-410e513132c1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c8cd1fa9-2430-462c-a3a3-cb8b5fdba51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8cd1fa9-2430-462c-a3a3-cb8b5fdba51d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bdef7b2f336c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8cd1fa9-2430-462c-a3a3-cb8b5fdba51d
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
Location: /v1/conversations/cnv_f834c788-4612-44ce-8975-5b0c281733da
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f834c788-4612-44ce-8975-5b0c281733da","subject":"Error contract","status":"open","region":"eu","participants":["qa-44b45b8b0999","qa-bdef7b2f336c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.986348256Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-348fb1ad-bf93-44b3-9571-12893d3c6de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-348fb1ad-bf93-44b3-9571-12893d3c6de7
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-348fb1ad-bf93-44b3-9571-12893d3c6de7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-348fb1ad-bf93-44b3-9571-12893d3c6de7","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7c108455-fc3f-4eb4-95da-3d2e0562b797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c108455-fc3f-4eb4-95da-3d2e0562b797
Content-Type: application/json

--- request body ---
{"handle":"qa-bdef7b2f336c","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c108455-fc3f-4eb4-95da-3d2e0562b797
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b758dec3-446e-46e2-9bb4-f51a955fd5f0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f13e129e-dbf8-4d77-b10e-388e6ab96183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f13e129e-dbf8-4d77-b10e-388e6ab96183
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f13e129e-dbf8-4d77-b10e-388e6ab96183
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
correlation: qa-b9d2268b-150c-4f18-bd49-05a41ab2c634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d2268b-150c-4f18-bd49-05a41ab2c634
Content-Type: application/json

--- request body ---
{"handle":"qa-bdef7b2f336c","password":"****"}

--- response: 401 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9d2268b-150c-4f18-bd49-05a41ab2c634
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9d2268b-150c-4f18-bd49-05a41ab2c634"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b4d8316-bfa2-4207-b6e1-22c44ab81bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4d8316-bfa2-4207-b6e1-22c44ab81bc5
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b4d8316-bfa2-4207-b6e1-22c44ab81bc5
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
correlation: qa-5ea3a996-d2d1-4fe8-a358-3804b3373e9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea3a996-d2d1-4fe8-a358-3804b3373e9c
Content-Type: application/json

--- request body ---
{"handle":"qa-44b45b8b0999","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ea3a996-d2d1-4fe8-a358-3804b3373e9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ea3a996-d2d1-4fe8-a358-3804b3373e9c"}
```
