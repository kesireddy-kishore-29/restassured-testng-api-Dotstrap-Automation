# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 4 | `qa-6f9e48ba-4c9f-47f7-95d4-1b79bc1ab438` |
| 2 | `POST /v1/auth/token` | 200 | 4 | `qa-1ea24ec6-a436-413f-9cfb-02d03fe984f2` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 5 | `qa-bee62178-79b7-4151-9877-90785068aad9` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-617ac853-1568-464e-bda8-4f6a357eb065` |
| 5 | `POST /v1/auth/token` | 401 | 2 | `qa-33e0c284-8aa7-4074-b254-6b6d17a9181c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f9e48ba-4c9f-47f7-95d4-1b79bc1ab438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9e48ba-4c9f-47f7-95d4-1b79bc1ab438
Content-Type: application/json

--- request body ---
{"handle":"qa-5fff3f41edf7","displayName":"QA 5fff3f41edf7","password":"****","region":"eu"}

--- response: 201 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f9e48ba-4c9f-47f7-95d4-1b79bc1ab438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 8
Location: /v1/accounts/qa-5fff3f41edf7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_06955a62-e350-4049-9897-bfce9a1fe3ea","handle":"qa-5fff3f41edf7","displayName":"QA 5fff3f41edf7","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.939285946Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1ea24ec6-a436-413f-9cfb-02d03fe984f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea24ec6-a436-413f-9cfb-02d03fe984f2
Content-Type: application/json

--- request body ---
{"handle":"qa-5fff3f41edf7","password":"****"}

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea24ec6-a436-413f-9cfb-02d03fe984f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_06955a62-e350-4049-9897-bfce9a1fe3ea"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-bee62178-79b7-4151-9877-90785068aad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bee62178-79b7-4151-9877-90785068aad9
Content-Type: application/json

--- response: 404 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bee62178-79b7-4151-9877-90785068aad9
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-bee62178-79b7-4151-9877-90785068aad9"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-617ac853-1568-464e-bda8-4f6a357eb065

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617ac853-1568-464e-bda8-4f6a357eb065
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-617ac853-1568-464e-bda8-4f6a357eb065
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
correlation: qa-33e0c284-8aa7-4074-b254-6b6d17a9181c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e0c284-8aa7-4074-b254-6b6d17a9181c
Content-Type: application/json

--- request body ---
{"handle":"qa-5fff3f41edf7","password":"****"}

--- response: 401 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33e0c284-8aa7-4074-b254-6b6d17a9181c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33e0c284-8aa7-4074-b254-6b6d17a9181c"}
```
