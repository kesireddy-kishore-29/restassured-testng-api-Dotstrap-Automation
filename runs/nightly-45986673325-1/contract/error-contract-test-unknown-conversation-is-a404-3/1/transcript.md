# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-6300c961-a4d3-4e43-84dc-3a0c19d5e40f` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-11f55f97-6ac9-48d0-a278-5aa8a38a4860` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 15 | `qa-3c4c71a1-f7e3-4da1-895d-0b02ad581569` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a7f1a3f5-6766-4686-99e7-a1b88f64b7ad` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-db45bb3a-916a-4dcb-8705-f3acfee0062a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6300c961-a4d3-4e43-84dc-3a0c19d5e40f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6300c961-a4d3-4e43-84dc-3a0c19d5e40f
Content-Type: application/json

--- request body ---
{"handle":"qa-f13a22cda706","displayName":"QA f13a22cda706","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6300c961-a4d3-4e43-84dc-3a0c19d5e40f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Location: /v1/accounts/qa-f13a22cda706
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6f6700f-2d91-4edb-acf7-01c3fa10b95a","handle":"qa-f13a22cda706","displayName":"QA f13a22cda706","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.584345759Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-11f55f97-6ac9-48d0-a278-5aa8a38a4860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11f55f97-6ac9-48d0-a278-5aa8a38a4860
Content-Type: application/json

--- request body ---
{"handle":"qa-f13a22cda706","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-11f55f97-6ac9-48d0-a278-5aa8a38a4860
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6f6700f-2d91-4edb-acf7-01c3fa10b95a"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-3c4c71a1-f7e3-4da1-895d-0b02ad581569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4c71a1-f7e3-4da1-895d-0b02ad581569
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c4c71a1-f7e3-4da1-895d-0b02ad581569
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-3c4c71a1-f7e3-4da1-895d-0b02ad581569"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7f1a3f5-6766-4686-99e7-a1b88f64b7ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7f1a3f5-6766-4686-99e7-a1b88f64b7ad
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7f1a3f5-6766-4686-99e7-a1b88f64b7ad
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
correlation: qa-db45bb3a-916a-4dcb-8705-f3acfee0062a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db45bb3a-916a-4dcb-8705-f3acfee0062a
Content-Type: application/json

--- request body ---
{"handle":"qa-f13a22cda706","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db45bb3a-916a-4dcb-8705-f3acfee0062a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db45bb3a-916a-4dcb-8705-f3acfee0062a"}
```
