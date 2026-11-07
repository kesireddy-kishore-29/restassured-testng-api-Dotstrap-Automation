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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-222f22ba-adf5-4a2a-b1fe-f63c880bc411` |
| 2 | `POST /v1/accounts` | 201 | 75 | `qa-e1430da7-441f-4a4c-8dea-3d3583ccfff7` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-f04b628c-e6da-4b2d-b14b-7ae48b1dee99` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-023c7e99-e13c-4400-a396-98d4043040b5` |
| 5 | `PATCH /v1/accounts/me` | 415 | 6 | `qa-34eaddfe-fd70-480a-b0eb-d0d5085fb766` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-95f9c4b6-8e6d-42df-b974-d262a3c12980` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-99861105-0ca9-4aca-9c62-236d0590a5ad` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-9ed1b272-d83c-4398-9669-50604ba8026e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-e1a594d3-b7a9-4239-9d7c-54a8728124f7` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-686053ad-8c2a-4c81-9d8e-34301085c1b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-222f22ba-adf5-4a2a-b1fe-f63c880bc411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-222f22ba-adf5-4a2a-b1fe-f63c880bc411
Content-Type: application/json

--- request body ---
{"handle":"qa-6749e308f0c9","displayName":"QA 6749e308f0c9","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-222f22ba-adf5-4a2a-b1fe-f63c880bc411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Location: /v1/accounts/qa-6749e308f0c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20d7ad65-ea5d-4443-8f5c-f1d0f7be88f9","handle":"qa-6749e308f0c9","displayName":"QA 6749e308f0c9","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.336393581Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1430da7-441f-4a4c-8dea-3d3583ccfff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1430da7-441f-4a4c-8dea-3d3583ccfff7
Content-Type: application/json

--- request body ---
{"handle":"qa-9c3beaad66cc","displayName":"QA 9c3beaad66cc","password":"****","region":"eu"}

--- response: 201 in 75 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1430da7-441f-4a4c-8dea-3d3583ccfff7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Location: /v1/accounts/qa-9c3beaad66cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77708752-b882-49e2-884a-1fa5d42e5ac2","handle":"qa-9c3beaad66cc","displayName":"QA 9c3beaad66cc","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.409597186Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f04b628c-e6da-4b2d-b14b-7ae48b1dee99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f04b628c-e6da-4b2d-b14b-7ae48b1dee99
Content-Type: application/json

--- request body ---
{"handle":"qa-6749e308f0c9","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f04b628c-e6da-4b2d-b14b-7ae48b1dee99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20d7ad65-ea5d-4443-8f5c-f1d0f7be88f9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-023c7e99-e13c-4400-a396-98d4043040b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023c7e99-e13c-4400-a396-98d4043040b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c3beaad66cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-023c7e99-e13c-4400-a396-98d4043040b5
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
Location: /v1/conversations/cnv_3e757340-d73f-4539-9a7f-9d9609f0dfdf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3e757340-d73f-4539-9a7f-9d9609f0dfdf","subject":"Error contract","status":"open","region":"eu","participants":["qa-6749e308f0c9","qa-9c3beaad66cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.520621126Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-34eaddfe-fd70-480a-b0eb-d0d5085fb766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34eaddfe-fd70-480a-b0eb-d0d5085fb766
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34eaddfe-fd70-480a-b0eb-d0d5085fb766
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-34eaddfe-fd70-480a-b0eb-d0d5085fb766"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-95f9c4b6-8e6d-42df-b974-d262a3c12980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95f9c4b6-8e6d-42df-b974-d262a3c12980
Content-Type: application/json

--- request body ---
{"handle":"qa-9c3beaad66cc","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-95f9c4b6-8e6d-42df-b974-d262a3c12980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77708752-b882-49e2-884a-1fa5d42e5ac2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99861105-0ca9-4aca-9c62-236d0590a5ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99861105-0ca9-4aca-9c62-236d0590a5ad
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99861105-0ca9-4aca-9c62-236d0590a5ad
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
correlation: qa-9ed1b272-d83c-4398-9669-50604ba8026e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed1b272-d83c-4398-9669-50604ba8026e
Content-Type: application/json

--- request body ---
{"handle":"qa-9c3beaad66cc","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ed1b272-d83c-4398-9669-50604ba8026e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ed1b272-d83c-4398-9669-50604ba8026e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1a594d3-b7a9-4239-9d7c-54a8728124f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a594d3-b7a9-4239-9d7c-54a8728124f7
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1a594d3-b7a9-4239-9d7c-54a8728124f7
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
correlation: qa-686053ad-8c2a-4c81-9d8e-34301085c1b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-686053ad-8c2a-4c81-9d8e-34301085c1b7
Content-Type: application/json

--- request body ---
{"handle":"qa-6749e308f0c9","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-686053ad-8c2a-4c81-9d8e-34301085c1b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-686053ad-8c2a-4c81-9d8e-34301085c1b7"}
```
