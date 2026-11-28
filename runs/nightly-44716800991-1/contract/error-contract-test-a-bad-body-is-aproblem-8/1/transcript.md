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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-13db93dd-ca8c-4a6f-a0df-98aac6f74b44` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-aec8e195-f688-416e-be02-cb8477494be6` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-ed1c89f9-8101-41be-9a14-c62a957c56fe` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-57220a83-c4d6-4d1d-b51e-994fd28504b7` |
| 5 | `PATCH /v1/accounts/me` | 422 | 15 | `qa-205a797e-03d8-4953-ac31-f7a410e0dba0` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-068f9447-e076-4bf9-823c-5f1578dc4891` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-85fb7f45-a963-492f-a746-5765d2bcb87e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-08bdd4b1-fb99-4108-a468-60455bbaebe9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fd6b1a4c-656c-4d00-86a2-4a0f83f844ea` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-e7d62b10-8107-4ec3-85b5-c2445e10d4a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-13db93dd-ca8c-4a6f-a0df-98aac6f74b44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13db93dd-ca8c-4a6f-a0df-98aac6f74b44
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cbb6f6b5b4","displayName":"QA d5cbb6f6b5b4","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-13db93dd-ca8c-4a6f-a0df-98aac6f74b44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-d5cbb6f6b5b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_285a1824-3d11-4526-9bb6-2506480bfab6","handle":"qa-d5cbb6f6b5b4","displayName":"QA d5cbb6f6b5b4","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.838075224Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aec8e195-f688-416e-be02-cb8477494be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec8e195-f688-416e-be02-cb8477494be6
Content-Type: application/json

--- request body ---
{"handle":"qa-7737f303213e","displayName":"QA 7737f303213e","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-aec8e195-f688-416e-be02-cb8477494be6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Location: /v1/accounts/qa-7737f303213e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_539c89d3-29a3-49f5-b2ed-6ae260cc74ed","handle":"qa-7737f303213e","displayName":"QA 7737f303213e","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.883234469Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed1c89f9-8101-41be-9a14-c62a957c56fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed1c89f9-8101-41be-9a14-c62a957c56fe
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cbb6f6b5b4","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed1c89f9-8101-41be-9a14-c62a957c56fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_285a1824-3d11-4526-9bb6-2506480bfab6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-57220a83-c4d6-4d1d-b51e-994fd28504b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57220a83-c4d6-4d1d-b51e-994fd28504b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7737f303213e","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-57220a83-c4d6-4d1d-b51e-994fd28504b7
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
Location: /v1/conversations/cnv_dc060fbf-1c2b-4c35-8d1c-98541f81f0e1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dc060fbf-1c2b-4c35-8d1c-98541f81f0e1","subject":"Error contract","status":"open","region":"eu","participants":["qa-d5cbb6f6b5b4","qa-7737f303213e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.976347302Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-205a797e-03d8-4953-ac31-f7a410e0dba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-205a797e-03d8-4953-ac31-f7a410e0dba0
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-205a797e-03d8-4953-ac31-f7a410e0dba0
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-205a797e-03d8-4953-ac31-f7a410e0dba0","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-068f9447-e076-4bf9-823c-5f1578dc4891

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-068f9447-e076-4bf9-823c-5f1578dc4891
Content-Type: application/json

--- request body ---
{"handle":"qa-7737f303213e","password":"****"}

--- response: 200 in 68 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-068f9447-e076-4bf9-823c-5f1578dc4891
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_539c89d3-29a3-49f5-b2ed-6ae260cc74ed"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85fb7f45-a963-492f-a746-5765d2bcb87e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fb7f45-a963-492f-a746-5765d2bcb87e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85fb7f45-a963-492f-a746-5765d2bcb87e
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
correlation: qa-08bdd4b1-fb99-4108-a468-60455bbaebe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08bdd4b1-fb99-4108-a468-60455bbaebe9
Content-Type: application/json

--- request body ---
{"handle":"qa-7737f303213e","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08bdd4b1-fb99-4108-a468-60455bbaebe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08bdd4b1-fb99-4108-a468-60455bbaebe9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd6b1a4c-656c-4d00-86a2-4a0f83f844ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6b1a4c-656c-4d00-86a2-4a0f83f844ea
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd6b1a4c-656c-4d00-86a2-4a0f83f844ea
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
correlation: qa-e7d62b10-8107-4ec3-85b5-c2445e10d4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7d62b10-8107-4ec3-85b5-c2445e10d4a1
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cbb6f6b5b4","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7d62b10-8107-4ec3-85b5-c2445e10d4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7d62b10-8107-4ec3-85b5-c2445e10d4a1"}
```
