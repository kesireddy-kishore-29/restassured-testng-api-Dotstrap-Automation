# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-249d233b-436e-48ea-8ac0-1c0d091a5ea3` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-f0789568-c468-4a21-b728-3d34f4eb3629` |
| 3 | `GET /v1/conversations/{id}` | 404 | 18 | `qa-6ec04cdd-041c-4db4-bf30-145fa7ccb7f6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-62069fbc-6daf-4cc4-a685-b34372c4752f` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-55384fb7-2c94-4f48-8842-024f300dd36b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-249d233b-436e-48ea-8ac0-1c0d091a5ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-249d233b-436e-48ea-8ac0-1c0d091a5ea3
Content-Type: application/json

--- request body ---
{"handle":"qa-d44496b95ffa","displayName":"QA d44496b95ffa","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-249d233b-436e-48ea-8ac0-1c0d091a5ea3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-d44496b95ffa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_27eab085-f177-48ce-8ebf-b08befb37c5e","handle":"qa-d44496b95ffa","displayName":"QA d44496b95ffa","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.791386685Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f0789568-c468-4a21-b728-3d34f4eb3629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0789568-c468-4a21-b728-3d34f4eb3629
Content-Type: application/json

--- request body ---
{"handle":"qa-d44496b95ffa","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0789568-c468-4a21-b728-3d34f4eb3629
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_27eab085-f177-48ce-8ebf-b08befb37c5e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-6ec04cdd-041c-4db4-bf30-145fa7ccb7f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ec04cdd-041c-4db4-bf30-145fa7ccb7f6
Content-Type: application/json

--- response: 404 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ec04cdd-041c-4db4-bf30-145fa7ccb7f6
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-6ec04cdd-041c-4db4-bf30-145fa7ccb7f6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62069fbc-6daf-4cc4-a685-b34372c4752f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62069fbc-6daf-4cc4-a685-b34372c4752f
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62069fbc-6daf-4cc4-a685-b34372c4752f
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-55384fb7-2c94-4f48-8842-024f300dd36b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55384fb7-2c94-4f48-8842-024f300dd36b
Content-Type: application/json

--- request body ---
{"handle":"qa-d44496b95ffa","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55384fb7-2c94-4f48-8842-024f300dd36b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55384fb7-2c94-4f48-8842-024f300dd36b"}
```
