# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-50c8fd18-5964-4f58-8288-87634144cdfa` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-d5c941fb-780c-4243-95a5-2e288b2521db` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-04eba031-e6a8-4603-9e0a-5b0fb3d901ce` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-98bcb5cb-8640-4a63-8be6-3d35805b276f` |
| 5 | `PATCH /v1/accounts/me` | 415 | 16 | `qa-a2052162-e9df-4b2a-ac03-907acc2e4d1b` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-1114c0ae-6c3d-4239-b5f2-ea506468e1e8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-022c71b7-a78e-4a53-8728-352d1b725c6b` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-f3f86c0b-44dc-466b-bcf9-fc868f319e7d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b9af78de-57b5-44bd-883b-2e962b30c48a` |
| 10 | `POST /v1/auth/token` | 401 | 37 | `qa-38dab1d6-b814-40e9-a641-9a0176805af1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-50c8fd18-5964-4f58-8288-87634144cdfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c8fd18-5964-4f58-8288-87634144cdfa
Content-Type: application/json

--- request body ---
{"handle":"qa-cababbcd38f4","displayName":"QA cababbcd38f4","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c8fd18-5964-4f58-8288-87634144cdfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-cababbcd38f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d72aea71-64b1-4133-9419-46f73a80dbf9","handle":"qa-cababbcd38f4","displayName":"QA cababbcd38f4","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.754295573Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d5c941fb-780c-4243-95a5-2e288b2521db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5c941fb-780c-4243-95a5-2e288b2521db
Content-Type: application/json

--- request body ---
{"handle":"qa-bf55d3f0c18f","displayName":"QA bf55d3f0c18f","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5c941fb-780c-4243-95a5-2e288b2521db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Location: /v1/accounts/qa-bf55d3f0c18f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb13a582-89d4-4728-9ed5-c59d02815e4b","handle":"qa-bf55d3f0c18f","displayName":"QA bf55d3f0c18f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:37.798229071Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-04eba031-e6a8-4603-9e0a-5b0fb3d901ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04eba031-e6a8-4603-9e0a-5b0fb3d901ce
Content-Type: application/json

--- request body ---
{"handle":"qa-cababbcd38f4","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-04eba031-e6a8-4603-9e0a-5b0fb3d901ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d72aea71-64b1-4133-9419-46f73a80dbf9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-98bcb5cb-8640-4a63-8be6-3d35805b276f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98bcb5cb-8640-4a63-8be6-3d35805b276f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bf55d3f0c18f","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-98bcb5cb-8640-4a63-8be6-3d35805b276f
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
Location: /v1/conversations/cnv_10664896-78a5-4371-91e0-0e26dc8b7965
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_10664896-78a5-4371-91e0-0e26dc8b7965","subject":"Error contract","status":"open","region":"eu","participants":["qa-cababbcd38f4","qa-bf55d3f0c18f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:37.888851307Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a2052162-e9df-4b2a-ac03-907acc2e4d1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2052162-e9df-4b2a-ac03-907acc2e4d1b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2052162-e9df-4b2a-ac03-907acc2e4d1b
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-a2052162-e9df-4b2a-ac03-907acc2e4d1b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1114c0ae-6c3d-4239-b5f2-ea506468e1e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1114c0ae-6c3d-4239-b5f2-ea506468e1e8
Content-Type: application/json

--- request body ---
{"handle":"qa-bf55d3f0c18f","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1114c0ae-6c3d-4239-b5f2-ea506468e1e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb13a582-89d4-4728-9ed5-c59d02815e4b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-022c71b7-a78e-4a53-8728-352d1b725c6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-022c71b7-a78e-4a53-8728-352d1b725c6b
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-022c71b7-a78e-4a53-8728-352d1b725c6b
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
correlation: qa-f3f86c0b-44dc-466b-bcf9-fc868f319e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f86c0b-44dc-466b-bcf9-fc868f319e7d
Content-Type: application/json

--- request body ---
{"handle":"qa-bf55d3f0c18f","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3f86c0b-44dc-466b-bcf9-fc868f319e7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3f86c0b-44dc-466b-bcf9-fc868f319e7d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9af78de-57b5-44bd-883b-2e962b30c48a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9af78de-57b5-44bd-883b-2e962b30c48a
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9af78de-57b5-44bd-883b-2e962b30c48a
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
correlation: qa-38dab1d6-b814-40e9-a641-9a0176805af1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38dab1d6-b814-40e9-a641-9a0176805af1
Content-Type: application/json

--- request body ---
{"handle":"qa-cababbcd38f4","password":"****"}

--- response: 401 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38dab1d6-b814-40e9-a641-9a0176805af1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38dab1d6-b814-40e9-a641-9a0176805af1"}
```
