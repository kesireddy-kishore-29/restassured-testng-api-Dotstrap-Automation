# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-f30acd2d-6ad2-4c10-bd49-034cd71e62cc` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-362ce9f0-728d-44b5-8a1c-a24b62a3f446` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-9823795e-bcde-4258-aec6-088b55e48edf` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-4bae7455-3ac7-4259-8e8e-b35e2dc0766d` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-295400bd-6575-4df7-a159-7d181efa137a` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-674ceff9-f64a-4207-9561-23d6e4e648fe` |
| 7 | `GET /v1/conversations/{id}` | 403 | 10 | `qa-2f53c1e3-808b-4115-9665-84a83240954d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-4f8ea6cb-e0e4-4111-8d16-c6077faf7d00` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-74da615b-f191-49b1-bb37-170da0559894` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-113396ec-77ef-4452-b506-26d8a510c95d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ecea0b02-d7a0-49e1-a421-f134279e0b66` |
| 12 | `POST /v1/auth/token` | 401 | 18 | `qa-c8d593df-5925-4cf0-b112-c56837b53e6f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ae85d130-18b6-45ab-ac28-bfc33e10f3ba` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-6461f367-0514-46f0-b1f0-3633acc4ff0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f30acd2d-6ad2-4c10-bd49-034cd71e62cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30acd2d-6ad2-4c10-bd49-034cd71e62cc
Content-Type: application/json

--- request body ---
{"handle":"qa-4ca41bcf4fd2","displayName":"QA 4ca41bcf4fd2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f30acd2d-6ad2-4c10-bd49-034cd71e62cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-4ca41bcf4fd2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_976e47d8-8934-4a04-b3b2-baea8c3f5627","handle":"qa-4ca41bcf4fd2","displayName":"QA 4ca41bcf4fd2","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.535357022Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-362ce9f0-728d-44b5-8a1c-a24b62a3f446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362ce9f0-728d-44b5-8a1c-a24b62a3f446
Content-Type: application/json

--- request body ---
{"handle":"qa-a905148dcaf1","displayName":"QA a905148dcaf1","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-362ce9f0-728d-44b5-8a1c-a24b62a3f446
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 10
Location: /v1/accounts/qa-a905148dcaf1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a22c463-23e3-43f8-afd2-ab585c07f16a","handle":"qa-a905148dcaf1","displayName":"QA a905148dcaf1","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.556619540Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9823795e-bcde-4258-aec6-088b55e48edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9823795e-bcde-4258-aec6-088b55e48edf
Content-Type: application/json

--- request body ---
{"handle":"qa-167eef46b081","displayName":"QA 167eef46b081","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-9823795e-bcde-4258-aec6-088b55e48edf
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
Location: /v1/accounts/qa-167eef46b081
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc71406a-9add-4b7b-af1b-d6bbe688db6e","handle":"qa-167eef46b081","displayName":"QA 167eef46b081","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.581936453Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-4bae7455-3ac7-4259-8e8e-b35e2dc0766d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bae7455-3ac7-4259-8e8e-b35e2dc0766d
Content-Type: application/json

--- request body ---
{"handle":"qa-4ca41bcf4fd2","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bae7455-3ac7-4259-8e8e-b35e2dc0766d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_976e47d8-8934-4a04-b3b2-baea8c3f5627"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-295400bd-6575-4df7-a159-7d181efa137a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-295400bd-6575-4df7-a159-7d181efa137a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a905148dcaf1","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-295400bd-6575-4df7-a159-7d181efa137a
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
Location: /v1/conversations/cnv_acc654c7-e2e8-4dce-a365-db03a9c58ac6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_acc654c7-e2e8-4dce-a365-db03a9c58ac6","subject":"Error contract","status":"open","region":"eu","participants":["qa-4ca41bcf4fd2","qa-a905148dcaf1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.645009969Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-674ceff9-f64a-4207-9561-23d6e4e648fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674ceff9-f64a-4207-9561-23d6e4e648fe
Content-Type: application/json

--- request body ---
{"handle":"qa-167eef46b081","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-674ceff9-f64a-4207-9561-23d6e4e648fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc71406a-9add-4b7b-af1b-d6bbe688db6e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_acc654c7-e2e8-4dce-a365-db03a9c58ac6
correlation: qa-2f53c1e3-808b-4115-9665-84a83240954d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f53c1e3-808b-4115-9665-84a83240954d
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f53c1e3-808b-4115-9665-84a83240954d
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_acc654c7-e2e8-4dce-a365-db03a9c58ac6","correlationId":"qa-2f53c1e3-808b-4115-9665-84a83240954d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f8ea6cb-e0e4-4111-8d16-c6077faf7d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f8ea6cb-e0e4-4111-8d16-c6077faf7d00
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f8ea6cb-e0e4-4111-8d16-c6077faf7d00
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
correlation: qa-74da615b-f191-49b1-bb37-170da0559894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74da615b-f191-49b1-bb37-170da0559894
Content-Type: application/json

--- request body ---
{"handle":"qa-167eef46b081","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74da615b-f191-49b1-bb37-170da0559894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74da615b-f191-49b1-bb37-170da0559894"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-113396ec-77ef-4452-b506-26d8a510c95d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-113396ec-77ef-4452-b506-26d8a510c95d
Content-Type: application/json

--- request body ---
{"handle":"qa-a905148dcaf1","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-113396ec-77ef-4452-b506-26d8a510c95d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a22c463-23e3-43f8-afd2-ab585c07f16a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecea0b02-d7a0-49e1-a421-f134279e0b66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecea0b02-d7a0-49e1-a421-f134279e0b66
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecea0b02-d7a0-49e1-a421-f134279e0b66
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
correlation: qa-c8d593df-5925-4cf0-b112-c56837b53e6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d593df-5925-4cf0-b112-c56837b53e6f
Content-Type: application/json

--- request body ---
{"handle":"qa-a905148dcaf1","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8d593df-5925-4cf0-b112-c56837b53e6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8d593df-5925-4cf0-b112-c56837b53e6f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae85d130-18b6-45ab-ac28-bfc33e10f3ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae85d130-18b6-45ab-ac28-bfc33e10f3ba
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae85d130-18b6-45ab-ac28-bfc33e10f3ba
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
correlation: qa-6461f367-0514-46f0-b1f0-3633acc4ff0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6461f367-0514-46f0-b1f0-3633acc4ff0c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ca41bcf4fd2","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6461f367-0514-46f0-b1f0-3633acc4ff0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6461f367-0514-46f0-b1f0-3633acc4ff0c"}
```
