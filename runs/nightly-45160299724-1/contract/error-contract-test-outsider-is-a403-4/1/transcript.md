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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-c78c76cd-5255-405f-8007-564262177e84` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-d3564687-85f2-4404-861b-f83cc8035f74` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-baa69741-b9bd-4e0a-8843-531619c85f57` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-757714cd-b7f3-42bd-9c69-099c462d8713` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-180a3995-bd25-44ad-b33d-ce7b4c3fca3c` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-0c22501e-ca83-4d51-be14-c4169717a29f` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 20 | `qa-fefee681-91c3-40be-8e48-9193c32719b5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-293f1c37-ab10-4ef7-b768-8f8b164081af` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-64915154-8fd1-4ec3-b75c-682c915fd543` |
| 10 | `POST /v1/auth/token` | 200 | 24 | `qa-94177149-43d6-4613-b5b7-94406a8c17b1` |
| 11 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-f991facc-2b35-47e9-98f9-78709759be50` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-9cbd76ec-5522-42ea-b020-d6c4a9f3cc97` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7d44012b-2313-46e5-a143-5c9ce99713ca` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-e2e044c0-4554-4114-9450-a6d97cc9c4a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c78c76cd-5255-405f-8007-564262177e84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c78c76cd-5255-405f-8007-564262177e84
Content-Type: application/json

--- request body ---
{"handle":"qa-c1dd7d36e5eb","displayName":"QA c1dd7d36e5eb","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c78c76cd-5255-405f-8007-564262177e84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Location: /v1/accounts/qa-c1dd7d36e5eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8813e3c-5905-49fd-a58b-921745e12786","handle":"qa-c1dd7d36e5eb","displayName":"QA c1dd7d36e5eb","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.815052903Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d3564687-85f2-4404-861b-f83cc8035f74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3564687-85f2-4404-861b-f83cc8035f74
Content-Type: application/json

--- request body ---
{"handle":"qa-dd68637319df","displayName":"QA dd68637319df","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3564687-85f2-4404-861b-f83cc8035f74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-dd68637319df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b545f95-0f81-487b-9206-55a124692b78","handle":"qa-dd68637319df","displayName":"QA dd68637319df","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.916734426Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-baa69741-b9bd-4e0a-8843-531619c85f57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa69741-b9bd-4e0a-8843-531619c85f57
Content-Type: application/json

--- request body ---
{"handle":"qa-20ae36fe575c","displayName":"QA 20ae36fe575c","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa69741-b9bd-4e0a-8843-531619c85f57
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
Location: /v1/accounts/qa-20ae36fe575c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd04a2a1-2cbd-46dd-a7d1-18cb245928cd","handle":"qa-20ae36fe575c","displayName":"QA 20ae36fe575c","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.955039168Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-757714cd-b7f3-42bd-9c69-099c462d8713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-757714cd-b7f3-42bd-9c69-099c462d8713
Content-Type: application/json

--- request body ---
{"handle":"qa-c1dd7d36e5eb","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-757714cd-b7f3-42bd-9c69-099c462d8713
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8813e3c-5905-49fd-a58b-921745e12786"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-180a3995-bd25-44ad-b33d-ce7b4c3fca3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-180a3995-bd25-44ad-b33d-ce7b4c3fca3c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd68637319df","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-180a3995-bd25-44ad-b33d-ce7b4c3fca3c
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
Location: /v1/conversations/cnv_7111babf-c7fa-4dea-9b3e-90590862dec6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7111babf-c7fa-4dea-9b3e-90590862dec6","subject":"Error contract","status":"open","region":"eu","participants":["qa-c1dd7d36e5eb","qa-dd68637319df"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.998732285Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c22501e-ca83-4d51-be14-c4169717a29f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c22501e-ca83-4d51-be14-c4169717a29f
Content-Type: application/json

--- request body ---
{"handle":"qa-20ae36fe575c","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c22501e-ca83-4d51-be14-c4169717a29f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd04a2a1-2cbd-46dd-a7d1-18cb245928cd"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7111babf-c7fa-4dea-9b3e-90590862dec6/close
correlation: qa-fefee681-91c3-40be-8e48-9193c32719b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fefee681-91c3-40be-8e48-9193c32719b5
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fefee681-91c3-40be-8e48-9193c32719b5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7111babf-c7fa-4dea-9b3e-90590862dec6/close","correlationId":"qa-fefee681-91c3-40be-8e48-9193c32719b5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-293f1c37-ab10-4ef7-b768-8f8b164081af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293f1c37-ab10-4ef7-b768-8f8b164081af
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-293f1c37-ab10-4ef7-b768-8f8b164081af
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
correlation: qa-64915154-8fd1-4ec3-b75c-682c915fd543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64915154-8fd1-4ec3-b75c-682c915fd543
Content-Type: application/json

--- request body ---
{"handle":"qa-20ae36fe575c","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64915154-8fd1-4ec3-b75c-682c915fd543
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64915154-8fd1-4ec3-b75c-682c915fd543"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-94177149-43d6-4613-b5b7-94406a8c17b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94177149-43d6-4613-b5b7-94406a8c17b1
Content-Type: application/json

--- request body ---
{"handle":"qa-dd68637319df","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-94177149-43d6-4613-b5b7-94406a8c17b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b545f95-0f81-487b-9206-55a124692b78"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f991facc-2b35-47e9-98f9-78709759be50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f991facc-2b35-47e9-98f9-78709759be50
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f991facc-2b35-47e9-98f9-78709759be50
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
correlation: qa-9cbd76ec-5522-42ea-b020-d6c4a9f3cc97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cbd76ec-5522-42ea-b020-d6c4a9f3cc97
Content-Type: application/json

--- request body ---
{"handle":"qa-dd68637319df","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cbd76ec-5522-42ea-b020-d6c4a9f3cc97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cbd76ec-5522-42ea-b020-d6c4a9f3cc97"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d44012b-2313-46e5-a143-5c9ce99713ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d44012b-2313-46e5-a143-5c9ce99713ca
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d44012b-2313-46e5-a143-5c9ce99713ca
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
correlation: qa-e2e044c0-4554-4114-9450-a6d97cc9c4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e044c0-4554-4114-9450-a6d97cc9c4a9
Content-Type: application/json

--- request body ---
{"handle":"qa-c1dd7d36e5eb","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2e044c0-4554-4114-9450-a6d97cc9c4a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2e044c0-4554-4114-9450-a6d97cc9c4a9"}
```
