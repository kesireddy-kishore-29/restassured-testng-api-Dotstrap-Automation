# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-d7f7a387-7ecb-4d97-9a03-bdfdf53f2db0` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-1e54c210-ba64-4c5b-a396-6e34523c2dd0` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-ef45fafd-e3f3-4c22-b68c-9f704db15a1d` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-65b63ff8-23a6-462f-b7ee-ee3da6e14cf2` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-96533eb4-4ff2-4b6f-833a-917f0a1b9ac2` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-3932e7e8-bbe9-4484-ae3b-1463949a8bc5` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-d6d6fe1c-5c29-4c78-a4b4-347157dc1877` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-2cbda39a-07b4-428e-a278-707c8b2257ca` |
| 9 | `GET /v1/credits/balance` | 200 | 6 | `qa-d84f6afc-1c4c-4a31-b1c4-c858ad54ed09` |
| 10 | `POST /v1/conversations` | 402 | 28 | `qa-c6afb309-435a-430c-bb87-3cd980496f1b` |
| 11 | `GET /v1/credits/ledger` | 200 | 13 | `qa-03a3cc2f-6660-4973-8ac2-dfffed4bb5a1` |
| 12 | `POST /v1/auth/token` | 200 | 12 | `qa-31a78e1d-24a5-47d4-8974-7a58400db86b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-1c8b4c3e-d608-4369-b8e7-965cf040881c` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-bda8600c-793d-4391-bb2b-f5dfa1770f9b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-4ce31435-84a2-42af-a616-699c0b35feac` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-8db781ed-88a3-4a7e-ade6-bd35cb2d68f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d7f7a387-7ecb-4d97-9a03-bdfdf53f2db0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7f7a387-7ecb-4d97-9a03-bdfdf53f2db0
Content-Type: application/json

--- request body ---
{"handle":"qa-ae538bf16d41","displayName":"QA ae538bf16d41","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7f7a387-7ecb-4d97-9a03-bdfdf53f2db0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-ae538bf16d41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ed0d765-6faa-4626-adb0-8d8f437f0b1c","handle":"qa-ae538bf16d41","displayName":"QA ae538bf16d41","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.634403770Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e54c210-ba64-4c5b-a396-6e34523c2dd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e54c210-ba64-4c5b-a396-6e34523c2dd0
Content-Type: application/json

--- request body ---
{"handle":"qa-7976dd767faf","displayName":"QA 7976dd767faf","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e54c210-ba64-4c5b-a396-6e34523c2dd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-7976dd767faf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0bdc01d-4ad6-459f-b23f-0cd3d8f85096","handle":"qa-7976dd767faf","displayName":"QA 7976dd767faf","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.665408690Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef45fafd-e3f3-4c22-b68c-9f704db15a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef45fafd-e3f3-4c22-b68c-9f704db15a1d
Content-Type: application/json

--- request body ---
{"handle":"qa-ae538bf16d41","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef45fafd-e3f3-4c22-b68c-9f704db15a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ed0d765-6faa-4626-adb0-8d8f437f0b1c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65b63ff8-23a6-462f-b7ee-ee3da6e14cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65b63ff8-23a6-462f-b7ee-ee3da6e14cf2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7976dd767faf","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-65b63ff8-23a6-462f-b7ee-ee3da6e14cf2
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
Location: /v1/conversations/cnv_cb839233-ca6e-4088-b027-cd4e5d426767
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","subject":"Error contract","status":"open","region":"eu","participants":["qa-ae538bf16d41","qa-7976dd767faf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.722661615Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cb839233-ca6e-4088-b027-cd4e5d426767/messages
correlation: qa-96533eb4-4ff2-4b6f-833a-917f0a1b9ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96533eb4-4ff2-4b6f-833a-917f0a1b9ac2
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-96533eb4-4ff2-4b6f-833a-917f0a1b9ac2
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
Content-Length: 192

{"id":"msg_16b6f97e-ebdf-4a64-b008-9b4714df7939","conversationId":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","sender":"qa-ae538bf16d41","body":"2","createdAt":"2026-11-12T09:56:31.749814218Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_cb839233-ca6e-4088-b027-cd4e5d426767/messages
correlation: qa-3932e7e8-bbe9-4484-ae3b-1463949a8bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3932e7e8-bbe9-4484-ae3b-1463949a8bc5
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3932e7e8-bbe9-4484-ae3b-1463949a8bc5
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
Content-Length: 192

{"id":"msg_aaef6fc4-12fc-4ecd-a2f2-375e0ef0871a","conversationId":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","sender":"qa-ae538bf16d41","body":"3","createdAt":"2026-11-12T09:56:31.768881392Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cb839233-ca6e-4088-b027-cd4e5d426767/messages
correlation: qa-d6d6fe1c-5c29-4c78-a4b4-347157dc1877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6d6fe1c-5c29-4c78-a4b4-347157dc1877
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6d6fe1c-5c29-4c78-a4b4-347157dc1877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_f5725b4f-1338-4c7e-8408-f9664d564b6a","conversationId":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","sender":"qa-ae538bf16d41","body":"4","createdAt":"2026-11-12T09:56:31.787286471Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_cb839233-ca6e-4088-b027-cd4e5d426767/messages
correlation: qa-2cbda39a-07b4-428e-a278-707c8b2257ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cbda39a-07b4-428e-a278-707c8b2257ca
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cbda39a-07b4-428e-a278-707c8b2257ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_133de653-82f7-4ab6-b847-a5b6a926df18","conversationId":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","sender":"qa-ae538bf16d41","body":"5","createdAt":"2026-11-12T09:56:31.812000196Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-d84f6afc-1c4c-4a31-b1c4-c858ad54ed09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84f6afc-1c4c-4a31-b1c4-c858ad54ed09
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d84f6afc-1c4c-4a31-b1c4-c858ad54ed09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_9ed0d765-6faa-4626-adb0-8d8f437f0b1c"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-c6afb309-435a-430c-bb87-3cd980496f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6afb309-435a-430c-bb87-3cd980496f1b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7976dd767faf","subject":"One more","message":"Hi"}

--- response: 402 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6afb309-435a-430c-bb87-3cd980496f1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-c6afb309-435a-430c-bb87-3cd980496f1b"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-03a3cc2f-6660-4973-8ac2-dfffed4bb5a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a3cc2f-6660-4973-8ac2-dfffed4bb5a1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-03a3cc2f-6660-4973-8ac2-dfffed4bb5a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_eea0487d-2cdf-4744-8a26-73288c5b346e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:31.634411562Z"},{"id":"led_b8414987-32bb-4720-9544-460ec0757b61","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_cb839233-ca6e-4088-b027-cd4e5d426767","createdAt":"2026-11-12T09:56:31.722649387Z"},{"id":"led_95871f89-e26a-4a7a-afc1-558e91e576ca","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_16b6f97e-ebdf-4a64-b008-9b4714df7939","createdAt":"2026-11-12T09:56:31.749809031Z"},{"id":"led_de023b45-1fa3-4502-980a-68e53c0fa3ac","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_aaef6fc4-12fc-4ecd-a2f2-375e0ef0871a","createdAt":"2026-11-12T09:56:31.768874783Z"},{"id":"led_0507c773-fc9a-4dfd-b75e-ada8bed742ce","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_f5725b4f-1338-4c7e-8408-f9664d564b6a","createdAt":"2026-11-12T09:56:31.787279620Z"},{"id":"led_472eb5f4-4b6f-403f-97e3-1e1d188cf286","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_133de653-82f7-4ab6-b847-a5b6a926df18","createdAt":"2026-11-12T09:56:31.811991333Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-31a78e1d-24a5-47d4-8974-7a58400db86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a78e1d-24a5-47d4-8974-7a58400db86b
Content-Type: application/json

--- request body ---
{"handle":"qa-7976dd767faf","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a78e1d-24a5-47d4-8974-7a58400db86b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0bdc01d-4ad6-459f-b23f-0cd3d8f85096"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c8b4c3e-d608-4369-b8e7-965cf040881c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c8b4c3e-d608-4369-b8e7-965cf040881c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c8b4c3e-d608-4369-b8e7-965cf040881c
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bda8600c-793d-4391-bb2b-f5dfa1770f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda8600c-793d-4391-bb2b-f5dfa1770f9b
Content-Type: application/json

--- request body ---
{"handle":"qa-7976dd767faf","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bda8600c-793d-4391-bb2b-f5dfa1770f9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bda8600c-793d-4391-bb2b-f5dfa1770f9b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ce31435-84a2-42af-a616-699c0b35feac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce31435-84a2-42af-a616-699c0b35feac
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ce31435-84a2-42af-a616-699c0b35feac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-8db781ed-88a3-4a7e-ade6-bd35cb2d68f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db781ed-88a3-4a7e-ade6-bd35cb2d68f9
Content-Type: application/json

--- request body ---
{"handle":"qa-ae538bf16d41","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8db781ed-88a3-4a7e-ade6-bd35cb2d68f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8db781ed-88a3-4a7e-ade6-bd35cb2d68f9"}
```
