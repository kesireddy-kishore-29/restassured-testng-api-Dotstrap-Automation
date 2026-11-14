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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-fd3d6d8d-6187-4fdf-b087-fea803592c4e` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-a959861c-2e69-4c8d-8fb0-b6836a7684e2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 10 | `qa-64e13655-0982-4fea-95cc-3673ea9bb735` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-74d57b68-1df9-4e97-93ac-3579f64d4212` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-46dad70c-c212-4e33-bba8-b760f3ef4ceb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd3d6d8d-6187-4fdf-b087-fea803592c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd3d6d8d-6187-4fdf-b087-fea803592c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-027d20844ef8","displayName":"QA 027d20844ef8","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd3d6d8d-6187-4fdf-b087-fea803592c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-027d20844ef8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3f09d7f-30a4-4fb3-b7d1-4387a77ff22b","handle":"qa-027d20844ef8","displayName":"QA 027d20844ef8","region":"eu","role":"user","createdAt":"2026-11-05T09:37:57.484432113Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a959861c-2e69-4c8d-8fb0-b6836a7684e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a959861c-2e69-4c8d-8fb0-b6836a7684e2
Content-Type: application/json

--- request body ---
{"handle":"qa-027d20844ef8","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a959861c-2e69-4c8d-8fb0-b6836a7684e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3f09d7f-30a4-4fb3-b7d1-4387a77ff22b"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-64e13655-0982-4fea-95cc-3673ea9bb735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64e13655-0982-4fea-95cc-3673ea9bb735
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64e13655-0982-4fea-95cc-3673ea9bb735
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-64e13655-0982-4fea-95cc-3673ea9bb735"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74d57b68-1df9-4e97-93ac-3579f64d4212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74d57b68-1df9-4e97-93ac-3579f64d4212
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74d57b68-1df9-4e97-93ac-3579f64d4212
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
correlation: qa-46dad70c-c212-4e33-bba8-b760f3ef4ceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46dad70c-c212-4e33-bba8-b760f3ef4ceb
Content-Type: application/json

--- request body ---
{"handle":"qa-027d20844ef8","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46dad70c-c212-4e33-bba8-b760f3ef4ceb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46dad70c-c212-4e33-bba8-b760f3ef4ceb"}
```
