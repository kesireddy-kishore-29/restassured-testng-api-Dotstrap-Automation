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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-27b66229-d76a-4069-b017-76a25909a1e4` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-bcdea885-45c9-4696-9193-3e5ec0de9a65` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-bbeb664a-2ee7-42f2-ab7c-b271b13a422f` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-8c39eb3e-7be5-493a-8112-c0ed569eb839` |
| 5 | `PATCH /v1/accounts/me` | 415 | 19 | `qa-94110799-e6c1-4393-b92e-25f674fc3039` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-af1c4f4b-60ec-4094-aff2-60d781783b42` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-897b7768-2226-4a0e-ae0a-f98d09c67e49` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-18d66ddc-8704-4916-bad0-0df94104d7b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-419e7c99-f572-4414-889b-94030cb5d14b` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-8acf2e85-b0a5-42e9-ba1f-c1156e2607ae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-27b66229-d76a-4069-b017-76a25909a1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b66229-d76a-4069-b017-76a25909a1e4
Content-Type: application/json

--- request body ---
{"handle":"qa-9adeb1684bc0","displayName":"QA 9adeb1684bc0","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-27b66229-d76a-4069-b017-76a25909a1e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-9adeb1684bc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb19dd9d-2ca6-43cd-a107-cea4cc276e0f","handle":"qa-9adeb1684bc0","displayName":"QA 9adeb1684bc0","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.603208433Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bcdea885-45c9-4696-9193-3e5ec0de9a65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcdea885-45c9-4696-9193-3e5ec0de9a65
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3713274b92","displayName":"QA 4b3713274b92","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcdea885-45c9-4696-9193-3e5ec0de9a65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-4b3713274b92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e2a1262c-e6c9-4f93-963b-f57e516dffe6","handle":"qa-4b3713274b92","displayName":"QA 4b3713274b92","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.627315547Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bbeb664a-2ee7-42f2-ab7c-b271b13a422f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbeb664a-2ee7-42f2-ab7c-b271b13a422f
Content-Type: application/json

--- request body ---
{"handle":"qa-9adeb1684bc0","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbeb664a-2ee7-42f2-ab7c-b271b13a422f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb19dd9d-2ca6-43cd-a107-cea4cc276e0f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8c39eb3e-7be5-493a-8112-c0ed569eb839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c39eb3e-7be5-493a-8112-c0ed569eb839
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4b3713274b92","subject":"Error contract","message":"Hi"}

--- response: 201 in 43 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c39eb3e-7be5-493a-8112-c0ed569eb839
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
Location: /v1/conversations/cnv_a558dc39-c0c6-42d9-a7c9-4a3d20d6a02e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a558dc39-c0c6-42d9-a7c9-4a3d20d6a02e","subject":"Error contract","status":"open","region":"eu","participants":["qa-9adeb1684bc0","qa-4b3713274b92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.729296084Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-94110799-e6c1-4393-b92e-25f674fc3039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94110799-e6c1-4393-b92e-25f674fc3039
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94110799-e6c1-4393-b92e-25f674fc3039
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-94110799-e6c1-4393-b92e-25f674fc3039"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-af1c4f4b-60ec-4094-aff2-60d781783b42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1c4f4b-60ec-4094-aff2-60d781783b42
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3713274b92","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-af1c4f4b-60ec-4094-aff2-60d781783b42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e2a1262c-e6c9-4f93-963b-f57e516dffe6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-897b7768-2226-4a0e-ae0a-f98d09c67e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-897b7768-2226-4a0e-ae0a-f98d09c67e49
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-897b7768-2226-4a0e-ae0a-f98d09c67e49
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
correlation: qa-18d66ddc-8704-4916-bad0-0df94104d7b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d66ddc-8704-4916-bad0-0df94104d7b9
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3713274b92","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18d66ddc-8704-4916-bad0-0df94104d7b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18d66ddc-8704-4916-bad0-0df94104d7b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-419e7c99-f572-4414-889b-94030cb5d14b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419e7c99-f572-4414-889b-94030cb5d14b
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-419e7c99-f572-4414-889b-94030cb5d14b
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
correlation: qa-8acf2e85-b0a5-42e9-ba1f-c1156e2607ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8acf2e85-b0a5-42e9-ba1f-c1156e2607ae
Content-Type: application/json

--- request body ---
{"handle":"qa-9adeb1684bc0","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8acf2e85-b0a5-42e9-ba1f-c1156e2607ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8acf2e85-b0a5-42e9-ba1f-c1156e2607ae"}
```
