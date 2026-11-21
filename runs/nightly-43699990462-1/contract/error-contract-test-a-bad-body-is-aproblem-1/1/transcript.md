# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-6b9c44c6-d053-42bf-8fbf-76c34ca997af` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-d2325423-aea1-4381-a296-77f1f7730167` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-33fbe44c-ec80-4f06-9c2c-2c80cb7cbe15` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-999b2bf0-90c1-4490-b6b1-4fbe86d4afd1` |
| 5 | `POST /v1/auth/token` | 415 | 32 | `qa-8864e8e5-e1e1-4459-b1fe-eba929c1d90c` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-18f657d6-01fa-4af4-8828-e83d17a38706` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b3ccab50-c30d-43a1-9dad-63fe3be4d7b2` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-7451b6cd-6be1-4741-ac44-1f074c303155` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-7b3ea206-44b8-47e0-ae90-efd80434aafc` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-46649b27-923a-4d58-bb99-461a24db406c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b9c44c6-d053-42bf-8fbf-76c34ca997af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b9c44c6-d053-42bf-8fbf-76c34ca997af
Content-Type: application/json

--- request body ---
{"handle":"qa-afd3c3671ee0","displayName":"QA afd3c3671ee0","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b9c44c6-d053-42bf-8fbf-76c34ca997af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-afd3c3671ee0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6bf592fe-05c4-4135-bd73-b1068255bb63","handle":"qa-afd3c3671ee0","displayName":"QA afd3c3671ee0","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.089518061Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d2325423-aea1-4381-a296-77f1f7730167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2325423-aea1-4381-a296-77f1f7730167
Content-Type: application/json

--- request body ---
{"handle":"qa-05b45e014447","displayName":"QA 05b45e014447","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2325423-aea1-4381-a296-77f1f7730167
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-05b45e014447
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1b317f6-006e-4d17-b77c-f18043d99a2c","handle":"qa-05b45e014447","displayName":"QA 05b45e014447","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.142413831Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-33fbe44c-ec80-4f06-9c2c-2c80cb7cbe15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33fbe44c-ec80-4f06-9c2c-2c80cb7cbe15
Content-Type: application/json

--- request body ---
{"handle":"qa-afd3c3671ee0","password":"****"}

--- response: 200 in 39 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-33fbe44c-ec80-4f06-9c2c-2c80cb7cbe15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bf592fe-05c4-4135-bd73-b1068255bb63"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-999b2bf0-90c1-4490-b6b1-4fbe86d4afd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999b2bf0-90c1-4490-b6b1-4fbe86d4afd1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-05b45e014447","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-999b2bf0-90c1-4490-b6b1-4fbe86d4afd1
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
Location: /v1/conversations/cnv_ac1163b2-77bb-4d15-9c25-22c14daec8f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ac1163b2-77bb-4d15-9c25-22c14daec8f7","subject":"Error contract","status":"open","region":"eu","participants":["qa-afd3c3671ee0","qa-05b45e014447"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.223480782Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8864e8e5-e1e1-4459-b1fe-eba929c1d90c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8864e8e5-e1e1-4459-b1fe-eba929c1d90c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8864e8e5-e1e1-4459-b1fe-eba929c1d90c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-8864e8e5-e1e1-4459-b1fe-eba929c1d90c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-18f657d6-01fa-4af4-8828-e83d17a38706

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18f657d6-01fa-4af4-8828-e83d17a38706
Content-Type: application/json

--- request body ---
{"handle":"qa-05b45e014447","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-18f657d6-01fa-4af4-8828-e83d17a38706
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1b317f6-006e-4d17-b77c-f18043d99a2c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3ccab50-c30d-43a1-9dad-63fe3be4d7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ccab50-c30d-43a1-9dad-63fe3be4d7b2
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3ccab50-c30d-43a1-9dad-63fe3be4d7b2
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
correlation: qa-7451b6cd-6be1-4741-ac44-1f074c303155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7451b6cd-6be1-4741-ac44-1f074c303155
Content-Type: application/json

--- request body ---
{"handle":"qa-05b45e014447","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7451b6cd-6be1-4741-ac44-1f074c303155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7451b6cd-6be1-4741-ac44-1f074c303155"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b3ea206-44b8-47e0-ae90-efd80434aafc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b3ea206-44b8-47e0-ae90-efd80434aafc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b3ea206-44b8-47e0-ae90-efd80434aafc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-46649b27-923a-4d58-bb99-461a24db406c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46649b27-923a-4d58-bb99-461a24db406c
Content-Type: application/json

--- request body ---
{"handle":"qa-afd3c3671ee0","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46649b27-923a-4d58-bb99-461a24db406c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46649b27-923a-4d58-bb99-461a24db406c"}
```
