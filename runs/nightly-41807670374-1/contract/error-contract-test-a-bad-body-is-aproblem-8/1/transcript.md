# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-09ce8597-7745-4d41-b11d-7a2c1e0b7f3f` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f6751e1d-f6f2-4f14-bed8-08170ed0585d` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-a035425d-72bc-46fb-872d-49ff41e62fc5` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-3d96acee-9142-4f8a-a704-9d1244bfdfa6` |
| 5 | `PATCH /v1/accounts/me` | 422 | 12 | `qa-b14c90d1-05f1-4a76-8013-51307fce1d9f` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-96ac8673-62e6-4319-9b0d-42b65a8d2986` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-dab9b7a5-3333-4a54-8597-38bd57e0e4e8` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-92c50213-76ba-4a33-9f63-865698c2346a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6fc2b12c-a991-44f4-8884-848cf80daa79` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-2edaeb1e-fdb8-4db0-bcb3-885b07e53cc3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09ce8597-7745-4d41-b11d-7a2c1e0b7f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ce8597-7745-4d41-b11d-7a2c1e0b7f3f
Content-Type: application/json

--- request body ---
{"handle":"qa-1b14062e5564","displayName":"QA 1b14062e5564","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-09ce8597-7745-4d41-b11d-7a2c1e0b7f3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Location: /v1/accounts/qa-1b14062e5564
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f1f9dc2-9b2b-4361-9953-e6ad20a34a87","handle":"qa-1b14062e5564","displayName":"QA 1b14062e5564","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.744506716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6751e1d-f6f2-4f14-bed8-08170ed0585d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6751e1d-f6f2-4f14-bed8-08170ed0585d
Content-Type: application/json

--- request body ---
{"handle":"qa-7757be0b256e","displayName":"QA 7757be0b256e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6751e1d-f6f2-4f14-bed8-08170ed0585d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 9
Location: /v1/accounts/qa-7757be0b256e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c060836-b107-4967-9e71-a758d0920bf1","handle":"qa-7757be0b256e","displayName":"QA 7757be0b256e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.784568718Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a035425d-72bc-46fb-872d-49ff41e62fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a035425d-72bc-46fb-872d-49ff41e62fc5
Content-Type: application/json

--- request body ---
{"handle":"qa-1b14062e5564","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a035425d-72bc-46fb-872d-49ff41e62fc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f1f9dc2-9b2b-4361-9953-e6ad20a34a87"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d96acee-9142-4f8a-a704-9d1244bfdfa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d96acee-9142-4f8a-a704-9d1244bfdfa6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7757be0b256e","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d96acee-9142-4f8a-a704-9d1244bfdfa6
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
Location: /v1/conversations/cnv_769dafe7-c442-492d-bc78-0aaf59af4ee5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_769dafe7-c442-492d-bc78-0aaf59af4ee5","subject":"Error contract","status":"open","region":"eu","participants":["qa-1b14062e5564","qa-7757be0b256e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.834086238Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b14c90d1-05f1-4a76-8013-51307fce1d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b14c90d1-05f1-4a76-8013-51307fce1d9f
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b14c90d1-05f1-4a76-8013-51307fce1d9f
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-b14c90d1-05f1-4a76-8013-51307fce1d9f","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-96ac8673-62e6-4319-9b0d-42b65a8d2986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96ac8673-62e6-4319-9b0d-42b65a8d2986
Content-Type: application/json

--- request body ---
{"handle":"qa-7757be0b256e","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-96ac8673-62e6-4319-9b0d-42b65a8d2986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c060836-b107-4967-9e71-a758d0920bf1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dab9b7a5-3333-4a54-8597-38bd57e0e4e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab9b7a5-3333-4a54-8597-38bd57e0e4e8
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dab9b7a5-3333-4a54-8597-38bd57e0e4e8
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
correlation: qa-92c50213-76ba-4a33-9f63-865698c2346a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c50213-76ba-4a33-9f63-865698c2346a
Content-Type: application/json

--- request body ---
{"handle":"qa-7757be0b256e","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92c50213-76ba-4a33-9f63-865698c2346a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92c50213-76ba-4a33-9f63-865698c2346a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fc2b12c-a991-44f4-8884-848cf80daa79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc2b12c-a991-44f4-8884-848cf80daa79
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fc2b12c-a991-44f4-8884-848cf80daa79
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
correlation: qa-2edaeb1e-fdb8-4db0-bcb3-885b07e53cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2edaeb1e-fdb8-4db0-bcb3-885b07e53cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-1b14062e5564","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2edaeb1e-fdb8-4db0-bcb3-885b07e53cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2edaeb1e-fdb8-4db0-bcb3-885b07e53cc3"}
```
