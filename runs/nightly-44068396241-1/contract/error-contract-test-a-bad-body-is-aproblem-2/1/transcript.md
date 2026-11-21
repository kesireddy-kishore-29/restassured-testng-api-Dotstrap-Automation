# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-682ff89c-b33a-4b78-834a-d995b4d90a50` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-5373136e-6151-41e8-943d-6b53a9319120` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-e8107746-3815-476e-b819-464ab568b24d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-4747c0fb-6698-4f38-98d1-74d2a38be296` |
| 5 | `POST /v1/auth/token` | 422 | 42 | `qa-8e6925d5-862a-4585-9c80-57d2c89bc070` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-bb99d5ed-23a1-49e3-95a1-a051fb483fcc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6609c4a2-c21a-4995-bbe2-b5f0d258c555` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-c1b4bc85-b1ea-4540-9352-2bf7405b94a7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ec12e367-e077-48c1-b840-924a474f7030` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-4beaf480-6d62-4be7-b6a1-20280afd779c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-682ff89c-b33a-4b78-834a-d995b4d90a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-682ff89c-b33a-4b78-834a-d995b4d90a50
Content-Type: application/json

--- request body ---
{"handle":"qa-02e86b5c0fe6","displayName":"QA 02e86b5c0fe6","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-682ff89c-b33a-4b78-834a-d995b4d90a50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-02e86b5c0fe6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c923e89b-b4b4-4dfe-bb38-21a5c335c201","handle":"qa-02e86b5c0fe6","displayName":"QA 02e86b5c0fe6","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.606884508Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5373136e-6151-41e8-943d-6b53a9319120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5373136e-6151-41e8-943d-6b53a9319120
Content-Type: application/json

--- request body ---
{"handle":"qa-be7cc0859fa7","displayName":"QA be7cc0859fa7","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-5373136e-6151-41e8-943d-6b53a9319120
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-be7cc0859fa7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4726091a-72d5-439b-a1ab-679fe3f608c3","handle":"qa-be7cc0859fa7","displayName":"QA be7cc0859fa7","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.644649578Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8107746-3815-476e-b819-464ab568b24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8107746-3815-476e-b819-464ab568b24d
Content-Type: application/json

--- request body ---
{"handle":"qa-02e86b5c0fe6","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8107746-3815-476e-b819-464ab568b24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c923e89b-b4b4-4dfe-bb38-21a5c335c201"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4747c0fb-6698-4f38-98d1-74d2a38be296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4747c0fb-6698-4f38-98d1-74d2a38be296
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be7cc0859fa7","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4747c0fb-6698-4f38-98d1-74d2a38be296
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
Location: /v1/conversations/cnv_59768add-3ec6-424e-b9fb-f522ffb1662b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_59768add-3ec6-424e-b9fb-f522ffb1662b","subject":"Error contract","status":"open","region":"eu","participants":["qa-02e86b5c0fe6","qa-be7cc0859fa7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.718868163Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8e6925d5-862a-4585-9c80-57d2c89bc070

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e6925d5-862a-4585-9c80-57d2c89bc070
Content-Type: application/json

--- request body ---
{"handle":"qa-02e86b5c0fe6","password":"****","ttlSeconds":0}

--- response: 422 in 42 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e6925d5-862a-4585-9c80-57d2c89bc070
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-8e6925d5-862a-4585-9c80-57d2c89bc070","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb99d5ed-23a1-49e3-95a1-a051fb483fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb99d5ed-23a1-49e3-95a1-a051fb483fcc
Content-Type: application/json

--- request body ---
{"handle":"qa-be7cc0859fa7","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb99d5ed-23a1-49e3-95a1-a051fb483fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4726091a-72d5-439b-a1ab-679fe3f608c3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6609c4a2-c21a-4995-bbe2-b5f0d258c555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6609c4a2-c21a-4995-bbe2-b5f0d258c555
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6609c4a2-c21a-4995-bbe2-b5f0d258c555
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
correlation: qa-c1b4bc85-b1ea-4540-9352-2bf7405b94a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1b4bc85-b1ea-4540-9352-2bf7405b94a7
Content-Type: application/json

--- request body ---
{"handle":"qa-be7cc0859fa7","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1b4bc85-b1ea-4540-9352-2bf7405b94a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1b4bc85-b1ea-4540-9352-2bf7405b94a7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec12e367-e077-48c1-b840-924a474f7030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec12e367-e077-48c1-b840-924a474f7030
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec12e367-e077-48c1-b840-924a474f7030
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
correlation: qa-4beaf480-6d62-4be7-b6a1-20280afd779c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4beaf480-6d62-4be7-b6a1-20280afd779c
Content-Type: application/json

--- request body ---
{"handle":"qa-02e86b5c0fe6","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4beaf480-6d62-4be7-b6a1-20280afd779c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4beaf480-6d62-4be7-b6a1-20280afd779c"}
```
