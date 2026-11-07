# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-c0080cc3-ccdb-4950-8206-33d9e2f75f78` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-340edae4-33e6-4a9a-9af5-9a880741d879` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-2ef54b36-ed2e-4b98-84ce-71d7851f4eae` |
| 4 | `POST /v1/auth/token` | 200 | 45 | `qa-e5676d79-3b4a-45e5-8232-8f0695a390f3` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-a7351ee3-13d3-4498-be11-af909b06dab4` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-342ca8ad-870b-4932-b736-b92d6b2a16e8` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 15 | `qa-0079229c-f7d5-4581-a8b2-bf0e74a6ff31` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f7ddafbf-4a71-4864-bbb7-dd3fc31e0085` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-1d7208f1-df51-4425-afc3-4fe013b49798` |
| 10 | `POST /v1/auth/token` | 200 | 21 | `qa-08a0e0cb-c0b9-4e54-b2bc-af996e96e8f9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-eef76fc8-7bf5-459c-9286-8ae88593958c` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-9f84b534-0d88-49d6-8828-09d6aadcb0fc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-828d52fd-762f-418f-bfbf-4d1a7cd223ce` |
| 14 | `POST /v1/auth/token` | 401 | 45 | `qa-b8084a3d-ee10-474a-a08d-714aa7eb0963` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0080cc3-ccdb-4950-8206-33d9e2f75f78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0080cc3-ccdb-4950-8206-33d9e2f75f78
Content-Type: application/json

--- request body ---
{"handle":"qa-c1ae1e3f2987","displayName":"QA c1ae1e3f2987","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0080cc3-ccdb-4950-8206-33d9e2f75f78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 9
Location: /v1/accounts/qa-c1ae1e3f2987
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8b7f8b2-e7fa-48e6-bf7a-b930bc36f4a4","handle":"qa-c1ae1e3f2987","displayName":"QA c1ae1e3f2987","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.328560255Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-340edae4-33e6-4a9a-9af5-9a880741d879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-340edae4-33e6-4a9a-9af5-9a880741d879
Content-Type: application/json

--- request body ---
{"handle":"qa-f76be199ba0e","displayName":"QA f76be199ba0e","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-340edae4-33e6-4a9a-9af5-9a880741d879
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Location: /v1/accounts/qa-f76be199ba0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66f0baa1-f902-49ae-a400-fd7e8e599547","handle":"qa-f76be199ba0e","displayName":"QA f76be199ba0e","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.376943246Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2ef54b36-ed2e-4b98-84ce-71d7851f4eae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef54b36-ed2e-4b98-84ce-71d7851f4eae
Content-Type: application/json

--- request body ---
{"handle":"qa-5a06c546de2d","displayName":"QA 5a06c546de2d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef54b36-ed2e-4b98-84ce-71d7851f4eae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Location: /v1/accounts/qa-5a06c546de2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_811b422f-5beb-4e5b-b164-4fa728a82467","handle":"qa-5a06c546de2d","displayName":"QA 5a06c546de2d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.425933944Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e5676d79-3b4a-45e5-8232-8f0695a390f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5676d79-3b4a-45e5-8232-8f0695a390f3
Content-Type: application/json

--- request body ---
{"handle":"qa-c1ae1e3f2987","password":"****"}

--- response: 200 in 45 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5676d79-3b4a-45e5-8232-8f0695a390f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8b7f8b2-e7fa-48e6-bf7a-b930bc36f4a4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a7351ee3-13d3-4498-be11-af909b06dab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7351ee3-13d3-4498-be11-af909b06dab4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f76be199ba0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7351ee3-13d3-4498-be11-af909b06dab4
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
Location: /v1/conversations/cnv_0b3b4d49-b161-4073-b2ca-3af26bc79a42
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0b3b4d49-b161-4073-b2ca-3af26bc79a42","subject":"Error contract","status":"open","region":"eu","participants":["qa-c1ae1e3f2987","qa-f76be199ba0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.544414722Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-342ca8ad-870b-4932-b736-b92d6b2a16e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-342ca8ad-870b-4932-b736-b92d6b2a16e8
Content-Type: application/json

--- request body ---
{"handle":"qa-5a06c546de2d","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-342ca8ad-870b-4932-b736-b92d6b2a16e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_811b422f-5beb-4e5b-b164-4fa728a82467"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_0b3b4d49-b161-4073-b2ca-3af26bc79a42/close
correlation: qa-0079229c-f7d5-4581-a8b2-bf0e74a6ff31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0079229c-f7d5-4581-a8b2-bf0e74a6ff31
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0079229c-f7d5-4581-a8b2-bf0e74a6ff31
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0b3b4d49-b161-4073-b2ca-3af26bc79a42/close","correlationId":"qa-0079229c-f7d5-4581-a8b2-bf0e74a6ff31"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7ddafbf-4a71-4864-bbb7-dd3fc31e0085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7ddafbf-4a71-4864-bbb7-dd3fc31e0085
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7ddafbf-4a71-4864-bbb7-dd3fc31e0085
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-1d7208f1-df51-4425-afc3-4fe013b49798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7208f1-df51-4425-afc3-4fe013b49798
Content-Type: application/json

--- request body ---
{"handle":"qa-5a06c546de2d","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d7208f1-df51-4425-afc3-4fe013b49798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d7208f1-df51-4425-afc3-4fe013b49798"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-08a0e0cb-c0b9-4e54-b2bc-af996e96e8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a0e0cb-c0b9-4e54-b2bc-af996e96e8f9
Content-Type: application/json

--- request body ---
{"handle":"qa-f76be199ba0e","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-08a0e0cb-c0b9-4e54-b2bc-af996e96e8f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66f0baa1-f902-49ae-a400-fd7e8e599547"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eef76fc8-7bf5-459c-9286-8ae88593958c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef76fc8-7bf5-459c-9286-8ae88593958c
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eef76fc8-7bf5-459c-9286-8ae88593958c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9f84b534-0d88-49d6-8828-09d6aadcb0fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f84b534-0d88-49d6-8828-09d6aadcb0fc
Content-Type: application/json

--- request body ---
{"handle":"qa-f76be199ba0e","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f84b534-0d88-49d6-8828-09d6aadcb0fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9f84b534-0d88-49d6-8828-09d6aadcb0fc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-828d52fd-762f-418f-bfbf-4d1a7cd223ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-828d52fd-762f-418f-bfbf-4d1a7cd223ce
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-828d52fd-762f-418f-bfbf-4d1a7cd223ce
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b8084a3d-ee10-474a-a08d-714aa7eb0963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8084a3d-ee10-474a-a08d-714aa7eb0963
Content-Type: application/json

--- request body ---
{"handle":"qa-c1ae1e3f2987","password":"****"}

--- response: 401 in 45 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8084a3d-ee10-474a-a08d-714aa7eb0963
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8084a3d-ee10-474a-a08d-714aa7eb0963"}
```
