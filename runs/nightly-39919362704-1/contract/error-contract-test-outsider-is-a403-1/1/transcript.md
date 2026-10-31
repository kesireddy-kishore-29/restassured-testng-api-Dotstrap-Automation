# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-f693f2c8-de11-4cb9-8c9b-ae4b9935d0c8` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-1f390f71-3dad-47b5-9a02-2d1eea0187ec` |
| 3 | `POST /v1/accounts` | 201 | 37 | `qa-85782a7a-56c6-4dcd-8e7c-f04a2b977abe` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-1dc65617-5d9d-4c62-93aa-c384cea47a23` |
| 5 | `POST /v1/conversations` | 201 | 17 | `qa-c1832fad-0733-4ac2-af08-ce1c9960683d` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-98ca1c5c-219c-488c-9100-3113f58614aa` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 11 | `qa-b15195ae-5aca-4d50-b7ea-6723882be1a6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-8f042a76-b483-453e-804c-60ad0a3c5a7a` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-368ce230-5a42-4c34-8357-e5360d16326c` |
| 10 | `POST /v1/auth/token` | 200 | 23 | `qa-b09e5016-9db6-4eee-9955-306b21460c20` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9ef9205f-60ec-4175-9780-5214ae39aff8` |
| 12 | `POST /v1/auth/token` | 401 | 46 | `qa-0359e8c8-62d0-4a4a-b995-84582b37e3e3` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-24944467-94ab-4613-80bc-9bdff98329ef` |
| 14 | `POST /v1/auth/token` | 401 | 32 | `qa-63def20d-bb67-4ce4-a046-7d7b25e0f37f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f693f2c8-de11-4cb9-8c9b-ae4b9935d0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f693f2c8-de11-4cb9-8c9b-ae4b9935d0c8
Content-Type: application/json

--- request body ---
{"handle":"qa-66ef22e031d5","displayName":"QA 66ef22e031d5","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f693f2c8-de11-4cb9-8c9b-ae4b9935d0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-66ef22e031d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_58ce786f-9749-4d15-b09b-dea4b329df83","handle":"qa-66ef22e031d5","displayName":"QA 66ef22e031d5","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.991421399Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1f390f71-3dad-47b5-9a02-2d1eea0187ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f390f71-3dad-47b5-9a02-2d1eea0187ec
Content-Type: application/json

--- request body ---
{"handle":"qa-890186b63566","displayName":"QA 890186b63566","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f390f71-3dad-47b5-9a02-2d1eea0187ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-890186b63566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_243f12d6-12d5-497e-8b54-2d22f0669d45","handle":"qa-890186b63566","displayName":"QA 890186b63566","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.032296970Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-85782a7a-56c6-4dcd-8e7c-f04a2b977abe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85782a7a-56c6-4dcd-8e7c-f04a2b977abe
Content-Type: application/json

--- request body ---
{"handle":"qa-4a2b29f751d8","displayName":"QA 4a2b29f751d8","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-85782a7a-56c6-4dcd-8e7c-f04a2b977abe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-4a2b29f751d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6aef3168-c832-4a84-8186-f66d358a6851","handle":"qa-4a2b29f751d8","displayName":"QA 4a2b29f751d8","region":"eu","role":"user","createdAt":"2026-10-23T07:41:44.075527586Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1dc65617-5d9d-4c62-93aa-c384cea47a23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc65617-5d9d-4c62-93aa-c384cea47a23
Content-Type: application/json

--- request body ---
{"handle":"qa-66ef22e031d5","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dc65617-5d9d-4c62-93aa-c384cea47a23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_58ce786f-9749-4d15-b09b-dea4b329df83"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c1832fad-0733-4ac2-af08-ce1c9960683d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1832fad-0733-4ac2-af08-ce1c9960683d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-890186b63566","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1832fad-0733-4ac2-af08-ce1c9960683d
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
Location: /v1/conversations/cnv_c83a2ed4-235b-43b8-9423-5447173a693f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c83a2ed4-235b-43b8-9423-5447173a693f","subject":"Error contract","status":"open","region":"eu","participants":["qa-66ef22e031d5","qa-890186b63566"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:44.197779530Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98ca1c5c-219c-488c-9100-3113f58614aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ca1c5c-219c-488c-9100-3113f58614aa
Content-Type: application/json

--- request body ---
{"handle":"qa-4a2b29f751d8","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ca1c5c-219c-488c-9100-3113f58614aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6aef3168-c832-4a84-8186-f66d358a6851"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c83a2ed4-235b-43b8-9423-5447173a693f/messages
correlation: qa-b15195ae-5aca-4d50-b7ea-6723882be1a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15195ae-5aca-4d50-b7ea-6723882be1a6
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b15195ae-5aca-4d50-b7ea-6723882be1a6
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c83a2ed4-235b-43b8-9423-5447173a693f/messages","correlationId":"qa-b15195ae-5aca-4d50-b7ea-6723882be1a6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f042a76-b483-453e-804c-60ad0a3c5a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f042a76-b483-453e-804c-60ad0a3c5a7a
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f042a76-b483-453e-804c-60ad0a3c5a7a
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
correlation: qa-368ce230-5a42-4c34-8357-e5360d16326c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-368ce230-5a42-4c34-8357-e5360d16326c
Content-Type: application/json

--- request body ---
{"handle":"qa-4a2b29f751d8","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-368ce230-5a42-4c34-8357-e5360d16326c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-368ce230-5a42-4c34-8357-e5360d16326c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b09e5016-9db6-4eee-9955-306b21460c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09e5016-9db6-4eee-9955-306b21460c20
Content-Type: application/json

--- request body ---
{"handle":"qa-890186b63566","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09e5016-9db6-4eee-9955-306b21460c20
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_243f12d6-12d5-497e-8b54-2d22f0669d45"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ef9205f-60ec-4175-9780-5214ae39aff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef9205f-60ec-4175-9780-5214ae39aff8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ef9205f-60ec-4175-9780-5214ae39aff8
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
correlation: qa-0359e8c8-62d0-4a4a-b995-84582b37e3e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0359e8c8-62d0-4a4a-b995-84582b37e3e3
Content-Type: application/json

--- request body ---
{"handle":"qa-890186b63566","password":"****"}

--- response: 401 in 46 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0359e8c8-62d0-4a4a-b995-84582b37e3e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0359e8c8-62d0-4a4a-b995-84582b37e3e3"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24944467-94ab-4613-80bc-9bdff98329ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24944467-94ab-4613-80bc-9bdff98329ef
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24944467-94ab-4613-80bc-9bdff98329ef
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-63def20d-bb67-4ce4-a046-7d7b25e0f37f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63def20d-bb67-4ce4-a046-7d7b25e0f37f
Content-Type: application/json

--- request body ---
{"handle":"qa-66ef22e031d5","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63def20d-bb67-4ce4-a046-7d7b25e0f37f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63def20d-bb67-4ce4-a046-7d7b25e0f37f"}
```
