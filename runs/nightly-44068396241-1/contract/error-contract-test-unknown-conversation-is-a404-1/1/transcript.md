# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-0dde3c63-0a16-413c-bb18-3a065da181c2` |
| 2 | `POST /v1/auth/token` | 200 | 5 | `qa-39b422bc-7059-4ed9-9939-52e9908bee45` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 6 | `qa-f4205b67-1b21-4155-bc66-fca27b3c6328` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8092f1ee-7b48-418a-94ba-1cdb2d21449c` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-7d7a550f-53b1-4ccc-ba7f-edfdc1619de8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0dde3c63-0a16-413c-bb18-3a065da181c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dde3c63-0a16-413c-bb18-3a065da181c2
Content-Type: application/json

--- request body ---
{"handle":"qa-cfc035ebd948","displayName":"QA cfc035ebd948","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dde3c63-0a16-413c-bb18-3a065da181c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-cfc035ebd948
X-Served-Region: eu
Content-Length: 181

{"id":"acc_712a28fe-00f4-466e-8a22-9e9e17a1f34f","handle":"qa-cfc035ebd948","displayName":"QA cfc035ebd948","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.311587071Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-39b422bc-7059-4ed9-9939-52e9908bee45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b422bc-7059-4ed9-9939-52e9908bee45
Content-Type: application/json

--- request body ---
{"handle":"qa-cfc035ebd948","password":"****"}

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b422bc-7059-4ed9-9939-52e9908bee45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_712a28fe-00f4-466e-8a22-9e9e17a1f34f"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-f4205b67-1b21-4155-bc66-fca27b3c6328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4205b67-1b21-4155-bc66-fca27b3c6328
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4205b67-1b21-4155-bc66-fca27b3c6328
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-f4205b67-1b21-4155-bc66-fca27b3c6328"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8092f1ee-7b48-418a-94ba-1cdb2d21449c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8092f1ee-7b48-418a-94ba-1cdb2d21449c
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8092f1ee-7b48-418a-94ba-1cdb2d21449c
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
correlation: qa-7d7a550f-53b1-4ccc-ba7f-edfdc1619de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7a550f-53b1-4ccc-ba7f-edfdc1619de8
Content-Type: application/json

--- request body ---
{"handle":"qa-cfc035ebd948","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d7a550f-53b1-4ccc-ba7f-edfdc1619de8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d7a550f-53b1-4ccc-ba7f-edfdc1619de8"}
```
