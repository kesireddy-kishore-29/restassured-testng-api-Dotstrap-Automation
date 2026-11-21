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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-eb8a41b6-8b83-40e2-9003-bf9c9f650281` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-c49ee483-b422-4d96-ae20-7f75c5433f03` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 7 | `qa-ba1add14-beff-4674-b61f-74fe363315e7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ddc22971-661e-45fe-b79c-b114a5ecf066` |
| 5 | `POST /v1/auth/token` | 401 | 3 | `qa-ff134ccf-ce79-438a-be63-bad66580dcc8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb8a41b6-8b83-40e2-9003-bf9c9f650281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb8a41b6-8b83-40e2-9003-bf9c9f650281
Content-Type: application/json

--- request body ---
{"handle":"qa-d61340b3c320","displayName":"QA d61340b3c320","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb8a41b6-8b83-40e2-9003-bf9c9f650281
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Location: /v1/accounts/qa-d61340b3c320
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f22b3524-9a03-40c6-9743-086bfa22b4bb","handle":"qa-d61340b3c320","displayName":"QA d61340b3c320","region":"eu","role":"user","createdAt":"2026-11-12T09:56:32.560837996Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c49ee483-b422-4d96-ae20-7f75c5433f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c49ee483-b422-4d96-ae20-7f75c5433f03
Content-Type: application/json

--- request body ---
{"handle":"qa-d61340b3c320","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c49ee483-b422-4d96-ae20-7f75c5433f03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f22b3524-9a03-40c6-9743-086bfa22b4bb"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-ba1add14-beff-4674-b61f-74fe363315e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba1add14-beff-4674-b61f-74fe363315e7
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba1add14-beff-4674-b61f-74fe363315e7
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-ba1add14-beff-4674-b61f-74fe363315e7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddc22971-661e-45fe-b79c-b114a5ecf066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc22971-661e-45fe-b79c-b114a5ecf066
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddc22971-661e-45fe-b79c-b114a5ecf066
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
correlation: qa-ff134ccf-ce79-438a-be63-bad66580dcc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff134ccf-ce79-438a-be63-bad66580dcc8
Content-Type: application/json

--- request body ---
{"handle":"qa-d61340b3c320","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff134ccf-ce79-438a-be63-bad66580dcc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ff134ccf-ce79-438a-be63-bad66580dcc8"}
```
