# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-5e4b8869-11f3-4357-b118-e27616d69375` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-54476dda-9777-44a3-8350-dbbbddec9595` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 42 | `qa-701e2941-3559-4cc8-a004-1000f6948fbf` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c2b0a3a2-d0a5-42d5-a805-5cd522cc9c18` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-602b1ede-60a2-4597-9131-332a3a412d7b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e4b8869-11f3-4357-b118-e27616d69375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4b8869-11f3-4357-b118-e27616d69375
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2fd61b6e4e","displayName":"QA 0c2fd61b6e4e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4b8869-11f3-4357-b118-e27616d69375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Location: /v1/accounts/qa-0c2fd61b6e4e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7972ec37-f55e-4900-9367-ad6036b72f56","handle":"qa-0c2fd61b6e4e","displayName":"QA 0c2fd61b6e4e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.186899712Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-54476dda-9777-44a3-8350-dbbbddec9595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54476dda-9777-44a3-8350-dbbbddec9595
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2fd61b6e4e","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-54476dda-9777-44a3-8350-dbbbddec9595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7972ec37-f55e-4900-9367-ad6036b72f56"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-701e2941-3559-4cc8-a004-1000f6948fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-701e2941-3559-4cc8-a004-1000f6948fbf
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-701e2941-3559-4cc8-a004-1000f6948fbf
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-701e2941-3559-4cc8-a004-1000f6948fbf"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2b0a3a2-d0a5-42d5-a805-5cd522cc9c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2b0a3a2-d0a5-42d5-a805-5cd522cc9c18
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2b0a3a2-d0a5-42d5-a805-5cd522cc9c18
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
correlation: qa-602b1ede-60a2-4597-9131-332a3a412d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602b1ede-60a2-4597-9131-332a3a412d7b
Content-Type: application/json

--- request body ---
{"handle":"qa-0c2fd61b6e4e","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-602b1ede-60a2-4597-9131-332a3a412d7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-602b1ede-60a2-4597-9131-332a3a412d7b"}
```
