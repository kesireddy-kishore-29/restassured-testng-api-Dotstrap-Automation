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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-3ff47311-7b86-4364-8425-f4101b8106a0` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-4999643e-d17e-4e1a-9110-c4ae4a6aa096` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 4 | `qa-73da3697-0206-4045-bf73-5c50b6a86c1f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-3ce39bbd-b7fb-44b6-8d37-ba400cebf51f` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-194282c6-8c7a-477c-a104-046d73d28d5d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ff47311-7b86-4364-8425-f4101b8106a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ff47311-7b86-4364-8425-f4101b8106a0
Content-Type: application/json

--- request body ---
{"handle":"qa-2665a260c1f1","displayName":"QA 2665a260c1f1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ff47311-7b86-4364-8425-f4101b8106a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Location: /v1/accounts/qa-2665a260c1f1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_162a051e-b3ab-4546-b50e-3ec5db93e864","handle":"qa-2665a260c1f1","displayName":"QA 2665a260c1f1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.410612175Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4999643e-d17e-4e1a-9110-c4ae4a6aa096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4999643e-d17e-4e1a-9110-c4ae4a6aa096
Content-Type: application/json

--- request body ---
{"handle":"qa-2665a260c1f1","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4999643e-d17e-4e1a-9110-c4ae4a6aa096
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_162a051e-b3ab-4546-b50e-3ec5db93e864"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-73da3697-0206-4045-bf73-5c50b6a86c1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73da3697-0206-4045-bf73-5c50b6a86c1f
Content-Type: application/json

--- response: 404 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73da3697-0206-4045-bf73-5c50b6a86c1f
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-73da3697-0206-4045-bf73-5c50b6a86c1f"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ce39bbd-b7fb-44b6-8d37-ba400cebf51f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce39bbd-b7fb-44b6-8d37-ba400cebf51f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ce39bbd-b7fb-44b6-8d37-ba400cebf51f
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
correlation: qa-194282c6-8c7a-477c-a104-046d73d28d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194282c6-8c7a-477c-a104-046d73d28d5d
Content-Type: application/json

--- request body ---
{"handle":"qa-2665a260c1f1","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-194282c6-8c7a-477c-a104-046d73d28d5d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-194282c6-8c7a-477c-a104-046d73d28d5d"}
```
