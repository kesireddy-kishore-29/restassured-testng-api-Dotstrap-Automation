# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-99b57d4f-d68c-4d44-a8f9-25e0ec18a578` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-ef077655-60e6-4210-8a79-724ae420e773` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-ebd84039-36ad-4ca8-af6e-344ff9cb7e46` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-b757d879-a88a-4fef-9638-d68f86439c70` |
| 5 | `POST /v1/credits/purchases` | 415 | 7 | `qa-2fbc0058-b0f0-44f7-8a02-cf851d443c2f` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-5b4f3f6e-4420-4103-af58-23c6f497ea3c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a4a3dd68-d85f-42ef-9865-493da65a37b7` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-fba03eeb-9c4c-4589-80b4-01bbebc80d77` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-e44e500e-e5b6-4fe2-9a55-abc2af188a0d` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-9b35731b-b487-4739-b066-d7a238e29b10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99b57d4f-d68c-4d44-a8f9-25e0ec18a578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b57d4f-d68c-4d44-a8f9-25e0ec18a578
Content-Type: application/json

--- request body ---
{"handle":"qa-41537a933dec","displayName":"QA 41537a933dec","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-99b57d4f-d68c-4d44-a8f9-25e0ec18a578
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
Location: /v1/accounts/qa-41537a933dec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c189fdda-fc5a-420a-8d2c-66b1207879ba","handle":"qa-41537a933dec","displayName":"QA 41537a933dec","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.836332701Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef077655-60e6-4210-8a79-724ae420e773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef077655-60e6-4210-8a79-724ae420e773
Content-Type: application/json

--- request body ---
{"handle":"qa-bcd3acaed647","displayName":"QA bcd3acaed647","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef077655-60e6-4210-8a79-724ae420e773
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Location: /v1/accounts/qa-bcd3acaed647
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23ca0e19-8c1a-4f71-94f7-15a78a31b0fa","handle":"qa-bcd3acaed647","displayName":"QA bcd3acaed647","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.873479285Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ebd84039-36ad-4ca8-af6e-344ff9cb7e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebd84039-36ad-4ca8-af6e-344ff9cb7e46
Content-Type: application/json

--- request body ---
{"handle":"qa-41537a933dec","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebd84039-36ad-4ca8-af6e-344ff9cb7e46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c189fdda-fc5a-420a-8d2c-66b1207879ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b757d879-a88a-4fef-9638-d68f86439c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b757d879-a88a-4fef-9638-d68f86439c70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bcd3acaed647","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b757d879-a88a-4fef-9638-d68f86439c70
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
Location: /v1/conversations/cnv_52c69147-9765-4446-80a5-533e91ec193c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_52c69147-9765-4446-80a5-533e91ec193c","subject":"Error contract","status":"open","region":"eu","participants":["qa-41537a933dec","qa-bcd3acaed647"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.925573569Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2fbc0058-b0f0-44f7-8a02-cf851d443c2f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-127d79e75dbc48cba2aca95f744f3424
X-Correlation-Id: qa-2fbc0058-b0f0-44f7-8a02-cf851d443c2f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fbc0058-b0f0-44f7-8a02-cf851d443c2f
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-2fbc0058-b0f0-44f7-8a02-cf851d443c2f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5b4f3f6e-4420-4103-af58-23c6f497ea3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4f3f6e-4420-4103-af58-23c6f497ea3c
Content-Type: application/json

--- request body ---
{"handle":"qa-bcd3acaed647","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b4f3f6e-4420-4103-af58-23c6f497ea3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23ca0e19-8c1a-4f71-94f7-15a78a31b0fa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4a3dd68-d85f-42ef-9865-493da65a37b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a3dd68-d85f-42ef-9865-493da65a37b7
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4a3dd68-d85f-42ef-9865-493da65a37b7
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
correlation: qa-fba03eeb-9c4c-4589-80b4-01bbebc80d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba03eeb-9c4c-4589-80b4-01bbebc80d77
Content-Type: application/json

--- request body ---
{"handle":"qa-bcd3acaed647","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fba03eeb-9c4c-4589-80b4-01bbebc80d77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fba03eeb-9c4c-4589-80b4-01bbebc80d77"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e44e500e-e5b6-4fe2-9a55-abc2af188a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e44e500e-e5b6-4fe2-9a55-abc2af188a0d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e44e500e-e5b6-4fe2-9a55-abc2af188a0d
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
correlation: qa-9b35731b-b487-4739-b066-d7a238e29b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b35731b-b487-4739-b066-d7a238e29b10
Content-Type: application/json

--- request body ---
{"handle":"qa-41537a933dec","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b35731b-b487-4739-b066-d7a238e29b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b35731b-b487-4739-b066-d7a238e29b10"}
```
